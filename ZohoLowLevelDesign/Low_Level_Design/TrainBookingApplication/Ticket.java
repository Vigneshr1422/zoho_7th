package ZohoLowLevelDesign.Low_Level_Design.TrainBookingApplication;
import java.util.*;

public class Ticket {
    private static int NEXT_PNR = 1;

    private final int pnr;
    private final int srcIdx, destIdx; // stations as indices 0..4 (A..E)
    private final int requestedSeats;  // original passenger count
    // seat numbers confirmed (empty if none)
    private int wlCount = 0;
    private boolean fullyCancelled = false;
    private final List<Integer> confirmedSeats = new ArrayList<>();
    // cancelled seat numbers (keeps history)
    private final List<Integer> cancelledSeats = new ArrayList<>();
    // waiting-list count (per passenger on this ticket) stored as indices in global WL queue positions snapshot not needed


    public Ticket(int srcIdx, int destIdx, int requestedSeats) {
        this.pnr = NEXT_PNR++;
        this.srcIdx = srcIdx;
        this.destIdx = destIdx;
        this.requestedSeats = requestedSeats;
    }

    public int getPnr() {
        return pnr;
    }

    public int getSrcIdx() {
        return srcIdx;
    }

    public int getDestIdx() {
        return destIdx;
    }
    public int getWlCount() {
        return wlCount;
    }

    public void incWlCount() {
        wlCount++;
    }

    public void decWlCount() {
        if (wlCount > 0) wlCount--;
    }


    public void addConfirmedSeat(int seatNo) {
        confirmedSeats.add(seatNo);
    }
    public List<Integer> getConfirmedSeats() {
        return confirmedSeats;
    }
    public int confirmedCount() {
        return confirmedSeats.size();
    }
    public int totalCount() {
        return confirmedCount() + wlCount;
    }

    public void addCancelledSeat(int seatNo) {
        cancelledSeats.add(seatNo);
    }

    public void setFullyCancelled() {
        fullyCancelled = true;
    }

    public boolean isFullyCancelled() {
        return fullyCancelled || (confirmedCount() == 0 && wlCount == 0);
    }


}