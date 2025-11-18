package ZohoLowLevelDesign.Console.Railway_Booking_platform;

public class Passenger {
    String name;
    int age;
    String gender;
    String birthPreference;
    String allocatedBerth;
    String ticketId;

    public Passenger(String name, int age, String gender, String birthPreference, String allocatedBerth, String ticketId)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.birthPreference=birthPreference;
        this.allocatedBerth=allocatedBerth;
        this.ticketId=ticketId;
    }
    @Override
    public String toString()
    {
        return "Ticket ID: "+ticketId +" Name: "+name+" Age: "+age+
                "Gender: "+gender+ "BirthPreference: "+birthPreference+" Allocated Birth :"+allocatedBerth;
    }




}
