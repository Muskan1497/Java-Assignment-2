import java.util.Scanner;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    // Constructor
    Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    // Getters and Setters
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return roomNumber + " " + block + " " + type;
    }
}

class Student {
    private String name;
    private int roll;
    private String course;
    private Room room;

    // Constructor
    Student(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " +
                course + " Room: " + room;
    }
}

public class UniversityHostelAllocation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.println("Format: Name,Roll,Course,RoomNumber,Block,Type");

        String input = sc.nextLine();

        String[] data = input.split(",");

        String name = data[0];
        int roll = Integer.parseInt(data[1]);
        String course = data[2];

        String roomNumber = data[3];
        String block = data[4];
        String type = data[5];

        // Create Room object
        Room room = new Room(roomNumber, block, type);

        // Create Student object with Room
        Student student = new Student(name, roll, course, room);

        System.out.println();
        System.out.println(student);

        sc.close();
    }
}