package ZohoLowLevelDesign.Console.SuperStore;

import java.util.Map;

public class ProductService {

    Map<Integer, Product> products = new java.util.HashMap<>();

    public void addProduct(Product product) {
        products.put(product.id, product);
        System.out.println("✅ Product added: " + product.name);
    }

    public void updateProduct(Product product) {
        if (products.containsKey(product.id)) {
            products.put(product.id, product);
            System.out.println("✅ Product updated: " + product.name);
        } else {
            System.out.println("❌ Product not found!");
        }
    }

    // =========================
    // List Inventory in Table Format
    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        System.out.println("------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-8s | %-8s |\n", "ID", "Name", "Price", "Quantity");
        System.out.println("------------------------------------------------");

        for (Product p : products.values()) {
            System.out.printf("| %-5d | %-10s | $%-8.2f | %-8d |\n", p.id, p.name, p.price, p.quantity);
        }

        System.out.println("------------------------------------------------");
    }

    public boolean isAvailable(int productId, int qty) {
        return products.containsKey(productId) && products.get(productId).quantity >= qty;
    }

    public void reduceQuantity(int productId, int qty) {
        if (isAvailable(productId, qty)) {
            products.get(productId).quantity -= qty;
        }
    }
}
