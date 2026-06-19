class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of 1000 must be maintained.");
        }
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);

        System.out.println("Interest added: " + interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount("ACC101", 10000, 5);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);

        System.out.println("Balance After Deposit: " +
                account.getBalance());

        account.addInterest();

        System.out.println("Balance After Interest: " +
                account.getBalance());

        account.withdraw(3000);

        System.out.println("Balance After Withdrawal: " +
                account.getBalance());

        account.withdraw(9000);
    }
}