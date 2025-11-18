package ZohoLowLevelDesign.Low_Level_Design.TrainBookingApplication;
import java.util.*;

/*
 Train handles seats, tickets, waiting list and booking/cancellation logic.
 Stations: A(0), B(1), C(2), D(3), E(4)
 */

public class Train {
    public static final int STATION_COUNT = 5;
    private final int MAX_WL = 2;

    private final Seat[] seats;
    private final LinkedHashMap<Integer, Ticket> allTickets = new LinkedHashMap<>();
    private final LinkedList<WLPassenger> waitingList = new LinkedList<>();

    public Train(int seatCount) {
        seats = new Seat[seatCount];
        for (int i = 0; i < seatCount; i++)
            seats[i] = new Seat(i + 1);
    }

    // Convert station letter to index
    public static int stationIndex(String s) {
        s = s.trim().toUpperCase();
        switch (s) {
            case "A": return 0;
            case "B": return 1;
            case "C": return 2;
            case "D": return 3;
            case "E": return 4;
            default: throw new IllegalArgumentException("Unknown station: " + s);
        }
    }

    private static String idxToStation(int idx) {

        return new String[] {"A","B","C","D","E"}[idx];
    }

    // Book: returns pnr printed in console; -1 on fail
    public int book(String src, String dst, int numSeats) {
        int s = stationIndex(src);
        int d = stationIndex(dst);
        if (!(s < d)) {
            System.out.println("Invalid route: " + src + " -> " + dst);
            return -1;
        }
        if (numSeats <= 0) {
            System.out.println("Number of seats must be positive.");
            return -1;
        }
        Ticket t = new Ticket(s, d, numSeats);
        // find free seats for this route
        List<Seat> freeSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.CheckIsFree(s, d)) freeSeats.add(seat);
        }
        int availableConfirmed = freeSeats.size();
        int availableWL = MAX_WL - waitingList.size();
        if (availableConfirmed + availableWL < numSeats) {
            System.out.println("Booking failed: not enough confirmed+WL slots available.");
            return -1;
        }
        /*
        💡 Example 1 — Enough space:

                Train has:
                x
                3 free seats

                2 WL spots left
                User wants 4 seats

                availableConfirmed = 3
                availableWL = 2
                numSeats = 4
                3 + 2 < 4 → false ✅

         */

        // allocate confirmed seats first
        int toConfirm = Math.min(availableConfirmed, numSeats);
        for (int i = 0; i < toConfirm; i++) {
            Seat seat = freeSeats.get(i);
            seat.occupy(s, d);
            t.addConfirmedSeat(seat.getNumber());
        }

        // remaining go to WL
        int remaining = numSeats - toConfirm;
        for (int i = 0; i < remaining; i++) {
            WLPassenger wp = new WLPassenger(t);
            waitingList.add(wp);
            t.incWlCount();
        }

        allTickets.put(t.getPnr(), t);

        // print result
        if (t.getWlCount() > 0 && t.confirmedCount() == 0) {
            System.out.println("PNR " + t.getPnr() + " booked with " + t.getWlCount() + " WL passengers (no confirmed).");
        } else if (t.getWlCount() > 0) {
            System.out.println("PNR " + t.getPnr() + " booked: Confirmed " + t.getConfirmedSeats() + " ; WL " + t.getWlCount());
        } else {
            System.out.println("PNR " + t.getPnr() + " booked: Confirmed " + t.getConfirmedSeats());
        }

        return t.getPnr();
    }

    // Cancel count passengers from a PNR (partial allowed). Confirmed seats cancelled first.
    public void cancel(int pnr, int numToCancel) {
        Ticket t = allTickets.get(pnr);
        if (t == null) {
            System.out.println("Cancel failed: PNR " + pnr + " not found.");
            return;
        }
        int active = t.totalCount();
        if (numToCancel <= 0 || numToCancel > active) {
            System.out.println("Cancel failed: invalid number to cancel. Active seats for PNR " + pnr + " = " + active);
            return;
        }

        int remaining = numToCancel;

        // cancel confirmed seats first (free seat legs)
        while (remaining > 0 && !t.getConfirmedSeats().isEmpty()) {
            int seatNo = t.getConfirmedSeats().remove(t.getConfirmedSeats().size() - 1);
            Seat seat = seats[seatNo - 1];
            seat.free(t.getSrcIdx(), t.getDestIdx());
            t.addCancelledSeat(seatNo);
            remaining--;
        }

        // cancel WL passengers if still need
        if (remaining > 0 && t.getWlCount() > 0) {
            Iterator<WLPassenger> it = waitingList.iterator();
            while (it.hasNext() && remaining > 0) {
                WLPassenger wp = it.next();
                if (wp.ownerTicket.getPnr() == pnr) {
                    it.remove();
                    t.decWlCount();
                    remaining--;
                }
            }
        }
        if (t.totalCount() == 0)
            t.setFullyCancelled();
        System.out.println("Cancelled " + numToCancel + " passenger(s) from PNR " + pnr + ". Active now: " + t.totalCount());
        // try to promote waiting list to confirmed
        promoteWaitingList();
    }

    // Promote WL passengers in queue order if seat available for their route.
    private void promoteWaitingList() {
        if (waitingList.isEmpty()) return;
        boolean promotedSomething;
        do {
            promotedSomething = false;
            Iterator<WLPassenger> it = waitingList.iterator();
            while (it.hasNext()) {
                WLPassenger wp = it.next();
                Ticket owner = wp.ownerTicket;
                // find any seat free for this WL passenger's route
                Seat free = null;
                for (Seat s : seats) {
                    if (s.CheckIsFree(wp.srcIdx, wp.destIdx)) { free = s; break; }
                }
                if (free != null) {
                    free.occupy(wp.srcIdx, wp.destIdx);
                    owner.addConfirmedSeat(free.getNumber());
                    owner.decWlCount();
                    it.remove();
                    System.out.println("Promoted WL -> confirmed: PNR " + owner.getPnr() + " seat " + free.getNumber());
                    promotedSomething = true;
                }
            }
        } while (promotedSomething);
    }

    // Print booking summary and seat chart
    public void printSummaryAndChart() {
        System.out.println("========== BOOKING SUMMARY ==========");
        for (Ticket t : allTickets.values()) {
            System.out.print("PNR " + t.getPnr() + " : ");
            System.out.print(idxToStation(t.getSrcIdx()) + " → " + idxToStation(t.getDestIdx()) + " | ");
            if (t.getConfirmedSeats().isEmpty()) System.out.print("Seats: - ");
            else System.out.print("Seats: " + t.getConfirmedSeats() + " ");
            System.out.print("| Status: ");
            if (t.isFullyCancelled()) System.out.println("Cancelled");
            else if (t.getWlCount() > 0) System.out.println("Waiting");
            else System.out.println("Confirmed");
        }
        System.out.println("=====================================");

        // Draw seat chart
        System.out.println("\nSeat Chart:");
        System.out.println("Seat | A | B | C | D | E");
        System.out.println("-----+---+---+---+---+---");
        for (Seat s : seats) {
            System.out.print(s.getNumber() + "   | ");
            for (int i = 0; i < STATION_COUNT; i++) {
                System.out.print((s.isOnBoardAtStationIndex(i) ? "*" : " ") + " | ");
            }
            System.out.println();
        }
    }
}
