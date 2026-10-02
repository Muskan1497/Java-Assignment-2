import java.util.Scanner;

class Vehicle {
    private String regNo;
    private String brand;
    private double baseRate;

    Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {

    Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return getBaseRate() * 1.5;
    }

    @Override
    public String toString() {
        return "Car " + getRegNo() + " " + getBrand() +
                " Rent: " + calculateRent();
    }
}

class Bike extends Vehicle {

    Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return getBaseRate() * 1.2;
    }

    @Override
    public String toString() {
        return "Bike " + getRegNo() + " " + getBrand() +
                " Rent: " + calculateRent();
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car details:");
        String[] carData = sc.nextLine().split(",");

        Vehicle car = new Car(
                carData[1],
                carData[2],
                Double.parseDouble(carData[3])
        );

        System.out.println("Enter Bike details:");
        String[] bikeData = sc.nextLine().split(",");

        Vehicle bike = new Bike(
                bikeData[1],
                bikeData[2],
                Double.parseDouble(bikeData[3])
        );

        System.out.println();
        System.out.println(car);
        System.out.println(bike);

        sc.close();
    }
}