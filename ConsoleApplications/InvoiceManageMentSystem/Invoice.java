package ConsoleApplications.InvoiceManageMentSystem;

import java.util.*;

public class Invoice {
    int invoiceId;
    int customerId;
    Date date;
    List<Item> items;

    public Invoice(int invoiceId, int customerId) {
        this.invoiceId = invoiceId;
        this.customerId = customerId;
        this.date = new Date();
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double totalAmount() {
        double sum = 0;
        for (Item i : items)
            sum += i.total();
        return sum;
    }

    public void printFullDetails(Map<Integer, Customer> map) {
        Customer c = map.get(customerId);
        System.out.println("--------- Invoice Details ---------");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Customer: " + c.name + " (" + c.email + ", " + c.phone + ")");
        System.out.println("Date: " + date);
        System.out.println("Items:");
        for (Item it : items) System.out.println("  " + it);
        System.out.println("Total Amount: " + totalAmount());
        System.out.println("-----------------------------------");
    }

    @Override
    public String toString() {
        return "Invoice ID: " + invoiceId + ", Customer ID: " + customerId + ", Date: " + date + ", Total: " + totalAmount();
    }
}
