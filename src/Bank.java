import java.util.ArrayList;
import java.util.List;

public class Bank {
    private ArrayList<BankAccount> bankAccounts;

    public Bank() {
        bankAccounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    public List<InterestBearing> getInterestBearingAccounts() {
        List<InterestBearing> interestBearingAccounts = new ArrayList<>();

        for (BankAccount account : bankAccounts) {
            if (account instanceof  InterestBearing) {
                interestBearingAccounts.add((InterestBearing) account);
            }
        }
        return interestBearingAccounts;
    }

    public void applyInterest() {
        for (BankAccount account : bankAccounts) {
            if (account instanceof InterestBearing) {
                ((InterestBearing) account).applyInterest();
            }
        }
    }
}
