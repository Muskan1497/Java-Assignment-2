import java.util.Scanner;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    abstract double calculateFare();

    @Override
    public String toString() {
        return "Flight No: " + flightNumber +
                "\nAirline: " + airline +
                "\nFare: " + calculateFare();
    }
}

class DomesticFlight extends Flight {

    DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}

class InternationalFlight extends Flight {

    InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}

public class FlightBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first flight details:");
        System.out.println("Format: Type,Flight Number,Airline,Fare");

        String input1 = sc.nextLine();
        String[] data1 = input1.split(",");

        String type1 = data1[0];
        String number1 = data1[1];
        String airline1 = data1[2];
        double fare1 = Double.parseDouble(data1[3]);

        Flight flight1;

        if (type1.equalsIgnoreCase("Domestic")) {
            flight1 = new DomesticFlight(number1, airline1, fare1);
        } else {
            flight1 = new InternationalFlight(number1, airline1, fare1);
        }

        System.out.println("Enter second flight details:");
        System.out.println("Format: Type,Flight Number,Airline,Fare");

        String input2 = sc.nextLine();
        String[] data2 = input2.split(",");

        String type2 = data2[0];
        String number2 = data2[1];
        String airline2 = data2[2];
        double fare2 = Double.parseDouble(data2[3]);

        Flight flight2;

        if (type2.equalsIgnoreCase("Domestic")) {
            flight2 = new DomesticFlight(number2, airline2, fare2);
        } else {
            flight2 = new InternationalFlight(number2, airline2, fare2);
        }

        System.out.println("\n--- Flight Details ---");
        System.out.println(flight1);

        System.out.println();

        System.out.println(flight2);

        sc.close();
    }
}