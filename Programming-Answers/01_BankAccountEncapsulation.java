// Demonstrates encapsulation, validation, and custom exceptions.
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) { super(message); }
}
class BankAccount {
    private final String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double openingBalance) {
        this.accountHolder = accountHolder;
        if (openingBalance < 0) throw new IllegalArgumentException("Negative opening balance");
        this.balance = openingBalance;
    }
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Deposit must be positive");
        balance += amount;
    }
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0 || amount > balance) throw new InvalidAmountException("Invalid amount or insufficient balance");
        balance -= amount;
    }
    public double getBalance() { return balance; }
    public String getAccountHolder() { return accountHolder; }
}
public class BankAccountEncapsulation {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount("Aarav", 5000);
        account.deposit(1500);
        account.withdraw(1000);
        System.out.println(account.getAccountHolder() + " balance: " + account.getBalance());
    }
}
