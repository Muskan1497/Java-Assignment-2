import java.util.Scanner;

// Abstract Loan class
abstract class Loan {
    private double principal;
    private double rate;
    private double time;

    // Constructor
    Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }

    // Abstract method
    abstract double calculateInterest();
}

// Home Loan
class HomeLoan extends Loan {

    HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    double calculateInterest() {
        return (getPrincipal() * getRate() * getTime()) / 100;
    }
}

// Car Loan
class CarLoan extends Loan {

    CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    double calculateInterest() {
        return (getPrincipal() * getRate() * getTime()) / 100;
    }
}

// Main class
public class LoanManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Home Loan input
        System.out.println("Enter Home Loan details:");
        String input1 = sc.nextLine();

        String[] data1 = input1.split(",");

        double principal1 = Double.parseDouble(data1[1]);
        double time1 = Double.parseDouble(data1[2]);

        Loan homeLoan = new HomeLoan(principal1, time1);

        // Car Loan input
        System.out.println("Enter Car Loan details:");
        String input2 = sc.nextLine();

        String[] data2 = input2.split(",");

        double principal2 = Double.parseDouble(data2[1]);
        double time2 = Double.parseDouble(data2[2]);

        Loan carLoan = new CarLoan(principal2, time2);

        // Output
        System.out.println();
        System.out.println("Home Loan Interest: " + homeLoan.calculateInterest());
        System.out.println("Car Loan Interest: " + carLoan.calculateInterest());

        sc.close();
    }
}