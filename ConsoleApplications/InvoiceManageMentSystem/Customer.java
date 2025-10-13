package ConsoleApplications.InvoiceManageMentSystem;

public class Customer {
    int id;
    String name;
    String email;
    String phone;

    public Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phone;
    }
}
