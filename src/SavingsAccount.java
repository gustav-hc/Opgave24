public class SavingsAccount extends BankAccount implements Withdrawable, Depositable, InterestBearing {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        setBalance(getBalance() + getBalance() * interestRate);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

}
