import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

@Test
void getInterestBearingAccounts() {
    //Arrange
    Bank bank = new Bank();
    SavingsAccount savingsAccount = new SavingsAccount(300, 0.05);
    SavingsAccount savingsAccount1 = new SavingsAccount(400, 0);
    ChildrensSavingAccount childrensSavingAccount = new ChildrensSavingAccount(1000);
    bank.addAccount(savingsAccount);
    bank.addAccount(childrensSavingAccount);

    //act
    List<InterestBearing> restult = bank.getInterestBearingAccounts();

    //Assert
    assertEquals(2, restult.size());
    assertTrue(restult.contains(savingsAccount));
    assertTrue(restult.contains(childrensSavingAccount));
}



}