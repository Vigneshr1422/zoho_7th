package ZohoLowLevelDesign.Console.Railway_Booking_platform;
    import java.util.*;
public class TicketSystem {
    private final List<String> availableBerth = new ArrayList<>(Arrays.asList("L", "U", "M"));
    private final Queue<Passenger> racQueue = new LinkedList<>();
    private final Queue<Passenger> waitingListQueue = new LinkedList<>();
    private final List<Passenger> confirmPassenger = new ArrayList<>();
    private int ticketCount = 1;

    public void bookTicket(String name, int age, String gender, String berthPreference) {
        String ticketId = "T" + ticketCount++;
        Passenger passenger;

        if (!availableBerth.isEmpty()) {
            String birthAllocate = allocate_function(gender,age,berthPreference);
            passenger=new Passenger(name,age,gender,berthPreference,birthAllocate,ticketId);
            confirmPassenger.add(passenger);
            availableBerth.remove(birthAllocate);
            System.out.println("Ticket Confirmed: "+passenger);
        } else if (racQueue.size() < 1) {
            passenger=new Passenger(name,age,gender,berthPreference,"RAC",ticketId);
            racQueue.offer(passenger);
            System.out.println("Ticket Move to RAC: "+passenger);

        } else if (waitingListQueue.size() < 1) {
            passenger=new Passenger(name,age,gender,berthPreference,"WL",ticketId);
            waitingListQueue.offer(passenger);
            System.out.println("Ticket Move to Waiting List: "+passenger);

        } else {
            System.out.println("No ticket Available");
        }
    }

    public String allocate_function(String gender, int age, String prefer) {
        if(age>60 || gender.equalsIgnoreCase("female") && availableBerth.contains("L")){
            return  "L";
        }else if(availableBerth.contains(prefer)) {
            return prefer;
        }
        return availableBerth.get(0);
}
    public void cancelTicket(String ticketId)
    {
//        Optional<Passenger> delete=confirmPassenger.stream().filter(p ->p.ticketId.equals(ticketId)).findFirst();
        Optional<Passenger> delete = Optional.empty(); // default as empty

        for (Passenger p : confirmPassenger) {
            if (p.ticketId.equals(ticketId)) {
                delete = Optional.of(p); // passenger found
                break; // stop the loop after finding the first match
            }
        }

        if(delete.isPresent())
        {
            Passenger passenger=delete.get();
            confirmPassenger.remove(passenger);
            availableBerth.add(passenger.allocatedBerth);

            if(!racQueue.isEmpty())
            {
                Passenger racPassenger=racQueue.poll();
                String allocatedBerth=allocate_function(racPassenger.gender,racPassenger.age,racPassenger.birthPreference);
                racPassenger.allocatedBerth=allocatedBerth;
                confirmPassenger.add(racPassenger);
                availableBerth.remove(allocatedBerth);
                System.out.println("RAC -> Confirm "+racPassenger);
            }
            if(!waitingListQueue.isEmpty())
            {
                Passenger waitingPass=waitingListQueue.poll();
                racQueue.offer(waitingPass);
                waitingPass.allocatedBerth="RAC";
                System.out.println("Waiting to RAC "+waitingPass);
            }
            System.out.println("Ticket cancel successfully "+ticketId);


        }
        else {
            System.out.println("Ticket id not found");

        }
    }
    public void printBookTicket()
    {
        if(confirmPassenger.isEmpty())
        {
            System.out.println("No confirm ticket");
        }else
        {
            System.out.println("Ticket is below ");
            for(Passenger passenger:confirmPassenger)
            {
                System.out.println(passenger);
            }
        }
    }

    public void availableTicket()
    {
        System.out.println("Available Ticket"+availableBerth.size());
        System.out.println("RAC is Ticket "+(1-racQueue.size()));
        System.out.println("Waiting list "+(1-waitingListQueue.size()));
    }
    public void racTicket()
    {
        if(racQueue.isEmpty())
        {
            System.out.println("No RAC ");
        }else {
            System.out.println("RAC Bro");
            for(Passenger passenger:racQueue)
            {
                System.out.println(passenger);
            }
        }
    }
    public void WaitingListTicket()
    {
        if(waitingListQueue.isEmpty())
        {
            System.out.println("No WL ");
        }else {
            System.out.println("Waiting list Bro");
            for(Passenger passenger:waitingListQueue)
            {
                System.out.println(passenger);
            }
        }
    }

}
