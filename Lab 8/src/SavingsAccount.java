public class SavingsAccount extends BankAccount {
    private double profitRate= 1.0;

    public SavingsAccount(String name, double b, double pr) {
        super(name,b);
        profitRate = pr;
    }
    public void applyProfit(){
        setBalance(getBalance()+getBalance()*profitRate/100);
    }

    @Override
    public String toString() {
        return String.format("Savings[%s, $%.2f, rate=%.2f%%]", getOwnerName(), getBalance(), profitRate);
    }
}
