import java.util.Scanner;

class Course {
    private String courseName;
    private String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return courseName + " (" + duration + ")";
    }
}

class Student1 {
    private String name;
    private Course enrolledCourse;

    Student1(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    public String getName() {
        return name;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                "\nCourse: " + enrolledCourse;
    }
}

class PremiumStudent extends Student1 {
    private double discount;

    PremiumStudent(String name, Course enrolledCourse, double discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " + getName() +
                "\nCourse: " + getEnrolledCourse() +
                "\nDiscount: " + discount + "%";
    }
}

public class OnlineCoursePlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter course details:");
        String[] courseData = sc.nextLine().split(",");

        Course course = new Course(
                courseData[0],
                courseData[1]
        );

        System.out.println("Enter student details:");
        String[] studentData = sc.nextLine().split(",");

        Student1 student = new Student1(
                studentData[0],
                course
        );

        System.out.println("Enter premium student details:");
        String[] premiumData = sc.nextLine().split(",");

        PremiumStudent premiumStudent = new PremiumStudent(
                premiumData[0],
                course,
                Double.parseDouble(premiumData[2])
        );

        System.out.println();
        System.out.println(student);

        System.out.println();

        System.out.println(premiumStudent);

        sc.close();
    }
}