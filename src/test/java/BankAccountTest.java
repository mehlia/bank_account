import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

//    Test for deposit
    @Test
    void deposit() {
//        Given
        BankAccount bankAccount = new BankAccount();
//        When
        bankAccount.setBalance(0);
//        Then
        bankAccount.deposit(1200);
        assertThat(0).isEqualTo(0);
        assertEquals(1200, bankAccount.getBalance(), 0.01);
    }

//    Test for withdrawal
    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1200);
        bankAccount.withdraw(70);
        assertThat(1200).isEqualTo(1200);
        assertEquals(1130, bankAccount.getBalance(), 0.01);
    }

//    Test to pay 5% interest
    @Test
    void interest() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1130);
        bankAccount.payInterest();
        assertThat(1130).isEqualTo(1130);
        assertEquals(1186, bankAccount.getBalance(), 0.01);
    }

}
