import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Professor class
class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    // Default constructor
    Professor() {
    }

    // Parameterized constructor
    Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", ID: " + employeeId +
                ", Specialization: " + specialization;
    }
}

// Department class
class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    // Default constructor
    Department() {
        professors = new ArrayList<>();
    }

    // Parameterized constructor
    Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        professors = new ArrayList<>();
    }

    // Getters and Setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    // Add professor
    public void addProfessor(Professor p) {
        professors.add(p);
    }

    @Override
    public String toString() {
        String result = "Department: " + deptName +
                "\nHOD: " + hodName +
                "\nProfessors:\n";

        for (Professor p : professors) {
            result = result + p + "\n";
        }

        return result;
    }
}

// Main class
public class UniversityDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Department input
        System.out.println("Enter Department details (deptName,hodName):");
        String departmentInput = sc.nextLine();

        String[] departmentData = departmentInput.split(",");

        String deptName = departmentData[0];
        String hodName = departmentData[1];

        Department department = new Department(deptName, hodName);

        // Number of professors
        System.out.println("Enter number of professors:");
        int n = sc.nextInt();
        sc.nextLine();

        // Professor input
        for (int i = 0; i < n; i++) {

            System.out.println("Enter professor details (name,employeeId,specialization):");

            String professorInput = sc.nextLine();

            String[] professorData = professorInput.split(",");

            String name = professorData[0];
            String employeeId = professorData[1];
            String specialization = professorData[2];

            Professor professor =
                    new Professor(name, employeeId, specialization);

            department.addProfessor(professor);
        }

        // Display details
        System.out.println();
        System.out.println(department);

        sc.close();
    }
}