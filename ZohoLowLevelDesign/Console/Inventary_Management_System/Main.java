package ZohoLowLevelDesign.Console.Inventary_Management_System;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            UserManager userManager = new UserManager();
            Inventory inventory = new Inventory();

            while (true) {
                System.out.println("\n1. Sign Up\n2. Login\n3. Exit");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String uname = sc.nextLine();
                        System.out.print("Enter password: ");
                        String pass = sc.nextLine();
                        System.out.print("Enter role (admin/user): ");
                        String role = sc.nextLine().toLowerCase();

                        if (userManager.signUp(uname, pass, role)) {
                            System.out.println("Sign Up successful!");
                        } else {
                            System.out.println("Username already exists.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter username: ");
                        String u = sc.nextLine();
                        System.out.print("Enter password: ");
                        String p = sc.nextLine();

                        User user = userManager.login(u, p);
                        if (user == null) {
                            System.out.println("Invalid credentials.");
                        } else {
                            System.out.println("Welcome, " + user.getUsername() + " (" + user.getRole() + ")");
                            if (user.getRole().equals("admin")) {
                                handleAdmin(sc, inventory);
                            } else {
                                handleUser(sc, inventory);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }

        static void handleAdmin(Scanner sc, Inventory inventory) {
            while (true) {
                System.out.println("\nAdmin Menu:\n1. Add Item\n2. View All\n3. Delete Item\n4. Exit");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        inventory.addItem(name, price, qty);
                        break;
                    case 2:
                        inventory.viewAll();
                        break;
                    case 3:
                        System.out.print("Enter item ID to delete: ");
                        int delId = sc.nextInt();
                        inventory.deleteItem(delId);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid admin choice.");
                }
            }
        }

        static void handleUser(Scanner sc, Inventory inventory) {
            while (true) {
                System.out.println("\nUser Menu:\n1. Buy\n2. View All Items\n3. Search by ID\n4. Exit");
                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("Enter item ID to buy: ");
                        int id = sc.nextInt();
                        inventory.buyItem(id);
                        break;
                    case 2:
                        inventory.viewAll();
                        break;
                    case 3:
                        System.out.print("Enter item ID to Problem_Solving.search: ");
                        int searchId = sc.nextInt();
                        Item item = inventory.searchById(searchId);
                        if (item != null) {
                            item.display();
                        } else {
                            System.out.println("Item not found.");
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid user choice.");
                }
            }
        }
    }


