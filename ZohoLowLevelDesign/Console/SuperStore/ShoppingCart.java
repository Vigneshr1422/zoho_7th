package ZohoLowLevelDesign.Console.SuperStore;
import java.util.*;
public class ShoppingCart {
    Map<Integer, Integer> cartItems = new HashMap<>();
    // Add items to cart
    public void addToCart(int productId, int quantity) {
        cartItems.put(productId, cartItems.getOrDefault(productId, 0) + quantity);
        System.out.println("Added to cart: Product ID " + productId + ", Quantity: " + quantity);
    }
    // Place order using keySet()
    public void placeOrder(ProductService inventory, PaymentGatewayService paymentService) {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        double totalAmount = 0;
        for (Integer id : cartItems.keySet()) {
            int qty = cartItems.get(id);
            if (!inventory.isAvailable(id, qty)) {
                System.out.println("Insufficient stock for product ID: " + id);
                return;
            }
            totalAmount += inventory.products.get(id).price * qty;
        }
        paymentService.makePayment(totalAmount);
        // Reduce inventory
        for (Integer id : cartItems.keySet()) {
            inventory.reduceQuantity(id, cartItems.get(id));
        }
        System.out.println("Order placed!");
        cartItems.clear();
    }
}