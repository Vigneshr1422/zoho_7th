package ZohoLowLevelDesign.Console.SuperStore;

import java.util.*;

public class SuperStoreApp {
    private static final HashMap<String, UserProfile> users = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    // shared inventory for all users
    private static final ProductService productService = new ProductService();
    private static final PaymentGatewayService paymentService = new PaymentGatewayService();

    public static void main(String[] args) {
        int choice;

        // Predefined Seller
        users.put("vignesh@gmail.com", new UserProfile("Vignesh", "vignesh@gmail.com", "abcd", "seller"));

        while (true) {
            System.out.println("\n--- Super Store ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }

    // =========================
    // Register User
    private static void registerUser() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (email.equalsIgnoreCase("vignesh@gmail.com")) {
            System.out.println("❌ This seller is predefined and cannot be registered again!");
            return;
        }

        if (users.containsKey(email)) {
            System.out.println("❌ User already exists!");
        } else {
            UserProfile user = new UserProfile(name, email, password, "buyer");
            users.put(email, user);
            System.out.println("✅ Registration successful! (Role: Buyer)");
        }
    }

    // =========================
    // Login User
    private static void loginUser() {
        System.out.print("Enter email: ");
        String loginEmail = sc.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = sc.nextLine();

        UserProfile user = users.get(loginEmail);

        if (user != null && user.checkPassword(loginPassword)) {
            System.out.println("✅ Login successful! Welcome, " + user.getName());

            if (user.getRole().equals("seller")) {
                sellerMenu(user);
            } else {
                buyerMenu(user);
            }
        } else {
            System.out.println("❌ Invalid email or password.");
        }
    }

    // =========================
    // Seller Menu (now functional)
    private static void sellerMenu(UserProfile user) {
        while (true) {
            System.out.println("\n--- Seller Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. View Inventory");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> updateProduct();
                case 3 -> productService.listProducts();
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // =========================
    // Add Product
    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        productService.addProduct(new Product(id, name, price, qty));
    }

    // =========================
    // Update Product
    private static void updateProduct() {
        System.out.print("Enter Product ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!productService.products.containsKey(id)) {
            System.out.println("❌ Product not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();
        System.out.print("Enter New Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter New Quantity: ");
        int qty = sc.nextInt();

        productService.updateProduct(new Product(id, name, price, qty));
    }

    // =========================
    // Buyer Menu
    private static void buyerMenu(UserProfile user) {
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n--- Buyer Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Add to Cart");
            System.out.println("3. Make Payment");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> productService.listProducts();
                case 2 -> {
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    cart.addToCart(pid, qty);
                }
                case 3 -> cart.placeOrder(productService, paymentService);
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
