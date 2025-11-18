package ZohoLowLevelDesign.Low_Level_Design.TrainBookingApplication;
public class WLPassenger {
    public final Ticket ownerTicket;
    public final int srcIdx, destIdx;

    public WLPassenger(Ticket t) {
        this.ownerTicket = t;
        this.srcIdx = t.getSrcIdx();
        this.destIdx = t.getDestIdx();
    }
}
