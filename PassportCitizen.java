import java.util.Scanner;

class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo +
                "\nIssue: " + issueDate +
                "\nExpiry: " + expiryDate;
    }
}

class Citizen1 {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    Citizen1(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name +
                "\nDOB: " + dob +
                "\nAddress: " + address +
                "\n" + passport;
    }
}

public class PassportCitizen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Citizen details:");
        String[] citizenData = sc.nextLine().split(",");

        String name = citizenData[0];
        String dob = citizenData[1];
        String address = citizenData[2];

        System.out.println("Enter Passport details:");
        String[] passportData = sc.nextLine().split(",");

        String passportNo = passportData[0];
        String issueDate = passportData[1];
        String expiryDate = passportData[2];

        Passport passport =
                new Passport(passportNo, issueDate, expiryDate);

        Citizen1 citizen =
                new Citizen1(name, dob, address, passport);

        System.out.println();
        System.out.println(citizen);

        sc.close();
    }
}