public class BankAccount {
    private double balance;
    private String ownerName;

    public BankAccount() {
        balance=0.0;
        ownerName="";
    }
    public BankAccount(String name, double b ) {
        balance=b;
        ownerName=name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        if(b>0)
            balance=b;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }
    public void deposit(double amount) {
        if(amount>0)
            balance+=amount;
    }
    public void withdraw(double amount) {
        if(amount<balance)
            balance-=amount;
    }
    @Override
    public String toString() {
        return String.format("Savings[%s, $%.2f]", ownerName, balance);
    }
}
