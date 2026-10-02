import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private String id;
    private double basicSalary;

    // Default constructor
    Employee() {
    }

    // Parameterized constructor
    Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Calculate salary
    double calculateSalary() {
        return basicSalary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

// Manager class
class Manager extends Employee {
    private double bonus;

    // Constructor chaining using super()
    Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + getName() + " (" + getId() +
                ") Salary: " + calculateSalary();
    }
}

// Main class
public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee input
        System.out.println("Enter employee details:");
        String input1 = sc.nextLine();

        String[] data1 = input1.split(",");

        String type1 = data1[0];
        String name1 = data1[1];
        String id1 = data1[2];
        double salary1 = Double.parseDouble(data1[3]);

        Employee employee = new Employee(name1, id1, salary1);

        // Manager input
        System.out.println("Enter manager details:");
        String input2 = sc.nextLine();

        String[] data2 = input2.split(",");

        String type2 = data2[0];
        String name2 = data2[1];
        String id2 = data2[2];
        double salary2 = Double.parseDouble(data2[3]);
        double bonus = Double.parseDouble(data2[4]);

        Manager manager = new Manager(name2, id2, salary2, bonus);

        // Output
        System.out.println("\n--- Payroll Details ---");
        System.out.println(employee);
        System.out.println(manager);

        sc.close();
    }
}