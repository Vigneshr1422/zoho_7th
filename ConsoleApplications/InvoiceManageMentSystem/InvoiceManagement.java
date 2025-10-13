package ConsoleApplications.InvoiceManageMentSystem;

import java.util.*;

public class InvoiceManagement {
    static Map<Integer, Customer> customers = new HashMap<>();
    static Map<Integer, Invoice> invoices = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add Customer 2.Add Invoice 3.Add Items 4.List Customers 5.List Invoices 6.Customer's Invoices 7.Invoice Details 8.Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addCustomer();
                case 2 -> addInvoice();
                case 3 -> addItemsToInvoice();
                case 4 -> listCustomers();
                case 5 -> listInvoices();
                case 6 -> listCustomerInvoices();
                case 7 -> displayInvoiceDetails();
                case 8 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addCustomer() {
        System.out.print("Customer ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Phone: "); String phone = sc.nextLine();
        customers.put(id, new Customer(id, name, email, phone));
        System.out.println("✅ Customer added!");
    }

    static void addInvoice() {
        System.out.print("Invoice ID: "); int invId = sc.nextInt();
        System.out.print("Customer ID: "); int custId = sc.nextInt();
        if (!customers.containsKey(custId)) {
            System.out.println("❌ Customer not found!");
            return;
        }
        invoices.put(invId, new Invoice(invId, custId));
        System.out.println("✅ Invoice created!");
    }

    static void addItemsToInvoice() {
        System.out.print("Invoice ID: "); int invId = sc.nextInt();
        Invoice inv = invoices.get(invId);
        if (inv == null) {
            System.out.println("❌ Invoice not found!");
            return;
        }
        System.out.print("Number of items: "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Item name: "); String name = sc.nextLine();
            System.out.print("Quantity: "); int qty = sc.nextInt();
            System.out.print("Price: "); double price = sc.nextDouble(); sc.nextLine();
            inv.addItem(new Item(name, qty, price));
        }
        System.out.println("✅ Items added!");
    }

    static void listCustomers() {
        System.out.println("----- CUSTOMERS -----");
        for (Customer c : customers.values()) System.out.println(c);
    }

    static void listInvoices() {
        System.out.println("----- INVOICES -----");
        for (Invoice i : invoices.values()) System.out.println(i);
    }

    static void listCustomerInvoices() {
        System.out.print("Customer ID: "); int custId = sc.nextInt();
        System.out.println("----- INVOICES -----");
        for (Invoice i : invoices.values())
            if (i.customerId == custId)
                System.out.println(i);
    }

    static void displayInvoiceDetails() {
        System.out.print("Invoice ID: "); int invId = sc.nextInt();
        Invoice inv = invoices.get(invId);
        if (inv != null) inv.printFullDetails(customers);
        else System.out.println("❌ Invoice not found!");
    }
}
