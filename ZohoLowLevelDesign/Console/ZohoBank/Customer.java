package ZohoLowLevelDesign.Console.ZohoBank;
// File: Customer.java
import java.util.ArrayList;

public class Customer {
    private int customerId;
    private int accountNumber;
    private String name;
    private String password; // store encrypted
    private double balance;
    private ArrayList<Transaction> transactions;
    private ArrayList<String> passwordHistory;

    // Constructor
    public Customer(int customerId, int accountNumber, String name, String password, double balance) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.passwordHistory = new ArrayList<>();
        this.passwordHistory.add(password); // initial password
    }

    // Getters & setters
    public int getCustomerId() { return customerId; }
    public int getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public String getPassword() { return password; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public ArrayList<Transaction> getTransactions() { return transactions; }
    public ArrayList<String> getPasswordHistory() { return passwordHistory; }

    // Add transaction
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Add password to history
    public void addPasswordHistory(String newPwd) {
        passwordHistory.add(newPwd);
        if(passwordHistory.size() > 3) { // keep last 3
            passwordHistory.remove(0);
        }
    }
}

