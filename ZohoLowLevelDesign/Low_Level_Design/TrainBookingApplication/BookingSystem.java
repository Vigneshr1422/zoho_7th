package ZohoLowLevelDesign.Low_Level_Design.TrainBookingApplication;

public class BookingSystem {
    private final Train train = new Train(8);

    public void processCommand(String cmd) {
        String[] parts = cmd.split(",");
        String action = parts[0].trim().toLowerCase();

        try {
            switch (action) {
                case "book":
                    if (parts.length != 4) {
                        System.out.println("Usage: book,<SRC>,<DST>,<COUNT>");
                        return;
                    }
                    train.book(parts[1].trim(), parts[2].trim(), Integer.parseInt(parts[3].trim()));
                    break;

                case "cancel":
                    if (parts.length != 3) {
                        System.out.println("Usage: cancel,<PNR>,<COUNT>");
                        return;
                    }
                    train.cancel(Integer.parseInt(parts[1].trim()), Integer.parseInt(parts[2].trim()));
                    break;

                case "chart":
                    train.printSummaryAndChart();
                    break;

                default:
                    System.out.println("❌ Unknown command: " + action);
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}
