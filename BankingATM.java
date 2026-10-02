import java.util.Scanner;

class Account {
    private int accNo;
    private String holderName;
    private double balance;

    Account(int accNo, String holderName) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Holder Name:");
        String holderName = sc.nextLine();

        Account account = new Account(accNo, holderName);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equalsIgnoreCase("deposit")) {
                double amount = sc.nextDouble();
                account.deposit(amount);
            }
            else if (operation.equalsIgnoreCase("withdraw")) {
                double amount = sc.nextDouble();
                account.withdraw(amount);
            }
            else if (operation.equalsIgnoreCase("getBalance")) {
                System.out.println("Balance: " + account.getBalance());
            }
        }

        sc.close();
    }
}