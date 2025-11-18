package ZohoLowLevelDesign.Console.ZohoBank;

// File: Transaction.java

public class Transaction {
    private int transId;
    private String transType;
    private double amount;
    private double balanceAfter;
    private int beneficiaryAccount; // optional

    public Transaction(int transId, String transType, double amount, double balanceAfter) {
        this.transId = transId;
        this.transType = transType;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.beneficiaryAccount = -1; // default none
    }

    public Transaction(int transId, String transType, double amount, double balanceAfter, int beneficiaryAccount) {
        this(transId, transType, amount, balanceAfter);
        this.beneficiaryAccount = beneficiaryAccount;
    }

    // Getters
    public int getTransId() { return transId; }
    public String getTransType() { return transType; }
    public double getAmount() { return amount; }
    public double getBalanceAfter() { return balanceAfter; }
    public int getBeneficiaryAccount() { return beneficiaryAccount; }
}
