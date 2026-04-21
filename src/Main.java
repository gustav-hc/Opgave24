public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(300, 0.05);
        SavingsAccount savingsAccount1 = new SavingsAccount(500, 0.07);

        ChildrensSavingAccount childrensSavingAccount = new ChildrensSavingAccount(1000);

    }

    public static void transfer(Withdrawable from, Depositable to, double amount){
        from.withdraw(amount);
        to.deposit(amount);
    }


}
