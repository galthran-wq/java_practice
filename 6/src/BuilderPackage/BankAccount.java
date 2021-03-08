package BuilderPackage;

public class BankAccount {
    public long accountNumber;
    public String owner;
    public String branch;
    public double balance;
    public double interestRate;

    public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.branch = branch;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public BankAccount() {}
}