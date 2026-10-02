import java.util.Scanner;

// Person class
class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAge: " + age;
    }
}

// Doctor extends Person
class Doctor extends Person {
    private String specialization;

    // Constructor chaining
    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpecialization: " + specialization;
    }
}

// Surgeon extends Doctor
class Surgeon extends Doctor {
    private String surgeryType;

    // Constructor chaining
    Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSurgery Type: " + surgeryType;
    }
}

// Main class
public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details (Name,Age,Specialization,Surgery Type):");

        String input = sc.nextLine();

        String[] data = input.split(",");

        String name = data[0];
        int age = Integer.parseInt(data[1]);
        String specialization = data[2];
        String surgeryType = data[3];

        Surgeon surgeon =
                new Surgeon(name, age, specialization, surgeryType);

        System.out.println();
        System.out.println(surgeon);

        sc.close();
    }
}