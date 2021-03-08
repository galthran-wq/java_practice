package BuilderPackage;

public class BankAccountBuilder {
    private long accountNumber; //This is important, so we'll pass it to the constructor.
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public BankAccountBuilder(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountBuilder withOwner(String owner){
        this.owner = owner;

        return this;  //By returning the builder each time, we can create a fluent interface.
    }

    public BankAccountBuilder atBranch(String branch){
        this.branch = branch;

        return this;
    }

    public BankAccountBuilder openingBalance(double balance){
        this.balance = balance;

        return this;
    }

    public BankAccountBuilder atRate(double interestRate){
        this.interestRate = interestRate;

        return this;
    }

    public BankAccount build() {
        //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
        BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
        account.accountNumber = this.accountNumber;
        account.owner = this.owner;
        account.branch = this.branch;
        account.balance = this.balance;
        account.interestRate = this.interestRate;

        return account;
    }
}
