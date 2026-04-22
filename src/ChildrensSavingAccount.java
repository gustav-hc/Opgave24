public class ChildrensSavingAccount extends BankAccount implements Depositable, InterestBearing{
    private double interestRate;

    public ChildrensSavingAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }



    public void applyInterest() {
        setBalance(getBalance() + getBalance() * interestRate);
    }
}