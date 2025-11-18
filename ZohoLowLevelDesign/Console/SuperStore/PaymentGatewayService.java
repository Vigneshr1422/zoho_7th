package ZohoLowLevelDesign.Console.SuperStore;

public class PaymentGatewayService {
    public boolean makePayment(double amount) {
        System.out.println("Payment of $" + amount + " successful!");
        return true;
    }
}
