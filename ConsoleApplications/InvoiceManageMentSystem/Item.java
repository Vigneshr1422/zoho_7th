package ConsoleApplications.InvoiceManageMentSystem;

public class Item {
    String name;
    int qty;
    double price;

    public Item(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public double total() {
        return qty * price;
    }

    @Override
    public String toString() {
        return name + " - Qty: " + qty + ", Price: " + price + ", Total: " + total();
    }
}
