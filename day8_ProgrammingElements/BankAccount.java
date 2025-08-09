package day8_ProgrammingElements;

public class BankAccount {
    private static String bankName = "National Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "ACC12345", 1500.75);
        BankAccount acc2 = new BankAccount("Bob", "ACC67890", 2500.50);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        System.out.println();
        BankAccount.getTotalAccounts();
    }
}

