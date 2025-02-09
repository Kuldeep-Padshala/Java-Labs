import java.util.Scanner;

class Bank_Account {
    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private String branch;
    private double balance;

    public Bank_Account( int accountNumber, String accountHolderName, String accountType, String branch, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.branch = branch;
        this.balance = balance;
    }

    public void getAccountDetails() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        this.accountNumber = sc.nextInt();
        sc.nextLine();                                           // Consume newline left-over
        System.out.print("Enter Account Holder Name: ");
        this.accountHolderName = sc.nextLine();
        System.out.print("Enter Account Type: ");
        this.accountType = sc.nextLine();
        System.out.print("Enter Branch: ");
        this.branch = sc.nextLine();
        System.out.print("Enter Balance: ");
        this.balance = sc.nextDouble();
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient Balance!");
        } 
        else {
            this.balance -= amount;
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Branch: " + this.branch);
        System.out.println("Balance: " + this.balance);
    }
}


public class a4_Bank {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Bank_Account account = new Bank_Account(0, "", "", "", 0.0);
        account.getAccountDetails();
        System.out.print("Enter 1 to deposit, 2 to withdraw, 3 to view account info: ");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        }
        else if(choice == 2) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        }
        else if(choice == 3) {
            account.displayAccountDetails();
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
