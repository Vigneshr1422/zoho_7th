package ZohoLowLevelDesign.Console.ZohoBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bank {
    private ArrayList<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }

    // Add customer
    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    // Get all customers
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    // Find customer by ID
    public Customer findCustomerById(int id) {
        for (Customer c : customerList) {
            if (c.getCustomerId() == id) return c;
        }
        return null;
    }

    // Find customer by account number
    public Customer findCustomerByAccount(int accNo) {
        for (Customer c : customerList) {
            if (c.getAccountNumber() == accNo) return c;
        }
        return null;
    }

    // Get top N customers by balance
    public ArrayList<Customer> getTopNCustomers(int n) {
        // Clone list to avoid modifying original
        ArrayList<Customer> sortedList = new ArrayList<>(customerList);

        // Sort descending by balance
        Collections.sort(sortedList, new Comparator<Customer>() {
            public int compare(Customer c1, Customer c2) {
                return Double.compare(c2.getBalance(), c1.getBalance());
            }
        });

        // Return only top N
        ArrayList<Customer> topN = new ArrayList<>();
        for (int i = 0; i < n && i < sortedList.size(); i++) {
            topN.add(sortedList.get(i));
        }
        return topN;
    }

    // TODO: load/save from/to file
}
