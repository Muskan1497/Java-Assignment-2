import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Guest {
    private String name;
    private int age;
    private String idProof;

    Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        guests = new ArrayList<>();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        String result = "Reservation ID: " + reservationId +
                "\nRoom: " + roomType +
                "\nGuests:\n";

        for (Guest guest : guests) {
            result += guest + "\n";
        }

        return result;
    }
}

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Reservation details:");
        String[] reservationData = sc.nextLine().split(",");

        String reservationId = reservationData[0];
        String roomType = reservationData[1];

        Reservation reservation =
                new Reservation(reservationId, roomType);

        System.out.println("Enter number of guests:");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Enter guest details (Name,Age,ID Proof):");

            String[] guestData = sc.nextLine().split(",");

            String name = guestData[0];
            int age = Integer.parseInt(guestData[1]);
            String idProof = guestData[2];

            Guest guest = new Guest(name, age, idProof);

            reservation.addGuest(guest);
        }

        System.out.println();
        System.out.println(reservation);

        sc.close();
    }
}