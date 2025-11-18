package ZohoLowLevelDesign.Console.ZohoBank;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // Sample initial customers
        bank.addCustomer(new Customer(11, 11011, "Kumar", "ApipNbjm", 10000));
        bank.addCustomer(new Customer(22, 22022, "Madhu", "Cboljoh", 20000));
        bank.addCustomer(new Customer(33, 33033, "Rahul", "dbnqvt", 30000));
        bank.addCustomer(new Customer(44, 44044, "Robin", "kbwb22", 40000));

        while (!exit) {
            System.out.println("\n===== Welcome to Zoho Bank =====");
            System.out.println("1. Login");
            System.out.println("2. Add New Customer");
            System.out.println("3. Top N Customers");
            System.out.println("4. Quit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pwd = sc.nextLine();

                    Customer c = bank.findCustomerById(cid);
                    if (c != null && c.getPassword().equals(pwd)) { // for demo, plain compare
                        System.out.println("Login Successful! Welcome " + c.getName());

                        boolean logout = false;
                        while (!logout) {
                            System.out.println("\n===== " + c.getName() + "'s Account =====");
                            System.out.println("1. ATM Withdrawal");
                            System.out.println("2. Cash Deposit");
                            System.out.println("3. Transfer");
                            System.out.println("4. Transaction History");
                            System.out.println("5. Logout");
                            System.out.print("Enter choice: ");
                            int userChoice = sc.nextInt();
                            sc.nextLine();

                            switch (userChoice) {
                                case 1:
                                    System.out.print("Enter amount to withdraw: ");
                                    double amt = sc.nextDouble();
                                    sc.nextLine();
                                    if (c.getBalance() - amt >= 1000) {
                                        c.setBalance(c.getBalance() - amt);
                                        int tid = c.getTransactions().size() + 1;
                                        c.addTransaction(new Transaction(tid, "ATM Withdrawal", amt, c.getBalance()));
                                        System.out.println("Withdrawal successful! New Balance: " + c.getBalance());
                                    } else {
                                        System.out.println("Insufficient balance. Minimum 1000 must remain.");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Enter amount to deposit: ");
                                    double dep = sc.nextDouble();
                                    sc.nextLine();
                                    c.setBalance(c.getBalance() + dep);
                                    int tid2 = c.getTransactions().size() + 1;
                                    c.addTransaction(new Transaction(tid2, "Cash Deposit", dep, c.getBalance()));
                                    System.out.println("Deposit successful! New Balance: " + c.getBalance());
                                    break;
                                case 3:
                                    System.out.print("Enter beneficiary account number: ");
                                    int toAcc = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter amount to transfer: ");
                                    double tAmt = sc.nextDouble();
                                    sc.nextLine();
                                    Customer ben = bank.findCustomerByAccount(toAcc);
                                    if (ben != null && c.getBalance() - tAmt >= 1000) {
                                        c.setBalance(c.getBalance() - tAmt);
                                        int tid3 = c.getTransactions().size() + 1;
                                        c.addTransaction(new Transaction(tid3, "TransferTo " + toAcc, tAmt, c.getBalance()));

                                        ben.setBalance(ben.getBalance() + tAmt);
                                        int tid4 = ben.getTransactions().size() + 1;
                                        ben.addTransaction(new Transaction(tid4, "TransferFrom " + c.getAccountNumber(), tAmt, ben.getBalance()));

                                        System.out.println("Transfer successful!");
                                    } else {
                                        System.out.println("Transfer failed. Check balance or beneficiary account.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Account Statement");
                                    System.out.println("Name: " + c.getName());
                                    System.out.println("Account No: " + c.getAccountNumber());
                                    System.out.println("Customer ID: " + c.getCustomerId());
                                    System.out.println("TransID  Type            Amount  Balance");
                                    for (Transaction t : c.getTransactions()) {
                                        System.out.printf("%d       %-15s %.2f   %.2f\n",
                                                t.getTransId(), t.getTransType(), t.getAmount(), t.getBalanceAfter());
                                    }
                                    break;
                                case 5:
                                    logout = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                        }

                    } else {
                        System.out.println("Invalid Customer ID or Password!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = sc.nextLine();
                    System.out.print("Re-type Password: ");
                    String pass2 = sc.nextLine();
                    if (!pass.equals(pass2)) {
                        System.out.println("Passwords do not match!");
                        break;
                    }
                    int newCid = 50 + bank.getCustomerList().size() + 1;
                    int newAcc = 55000 + bank.getCustomerList().size() + 1;
                    Customer newCust = new Customer(newCid, newAcc, name, pass, 10000);
                    bank.addCustomer(newCust);
                    System.out.println("Customer added successfully!");
                    System.out.println("Customer ID: " + newCid);
                    System.out.println("Account Number: " + newAcc);
                    break;

                case 3:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    ArrayList<Customer> topList = bank.getTopNCustomers(n);
                    System.out.println("Top " + n + " Customers by Balance:");
                    for (int i = 0; i < topList.size(); i++) {
                        System.out.println((i + 1) + ". " + topList.get(i).getName() + " - " + topList.get(i).getBalance());
                    }
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        System.out.println("Thank you for using Zoho Bank!");
    }
}
