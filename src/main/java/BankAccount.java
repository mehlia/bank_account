import java.time.LocalDate;

public class BankAccount {
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public int accountNumber;
    public int balance;
    public String accountType;
    public int overDraft;

//    Getters & Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName () {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName () {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth () {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }


//    Deposit money method
    public void deposit(int amount) {
        this.balance += amount;
    }

//    Withdraw money method
    public void withdraw(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Funds!");
        }
    }

//    Pay interest 5% method
    public void payInterest() {
        this.balance += this.balance * 0.05;
    }

//    Adjust interest method
    public void adjustInterest() {
        double interestRate = 0.05;
        if (accountType != null) {
            if (accountType.equalsIgnoreCase("Savings Account")) {
                interestRate = 0.1;
            }
            else if (accountType.equalsIgnoreCase("Current Account")) {
                interestRate = 0.03;
            }
        }
        this.balance += this.balance * interestRate;
    }

//    Overdraft method
    public void withdrawOverdraft(int amount) {
        if (balance - amount <= overDraft) {
            this.balance -= amount;
        }
        else {
            System.out.println("EXCEEDS AVAILABLE BALANCE!");
        }
    }

}
