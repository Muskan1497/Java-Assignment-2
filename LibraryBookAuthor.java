import java.util.Scanner;

// Author class
class Author {
    private String name;
    private String email;
    private String gender;

    // Constructor
    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

// Book class
class Book {
    private String title;
    private double price;
    private Author author;

    // Constructor
    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                "\nPrice: " + price +
                "\nAuthor: " + author;
    }
}

// Main class
public class LibraryBookAuthor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book details (Title,Price,Author Name,Email,Gender):");

        String input = sc.nextLine();

        String[] data = input.split(",");

        String title = data[0];
        double price = Double.parseDouble(data[1]);
        String authorName = data[2];
        String email = data[3];
        String gender = data[4];

        // Create Author object
        Author author = new Author(authorName, email, gender);

        // Create Book object
        Book book = new Book(title, price, author);

        System.out.println();
        System.out.println(book);

        sc.close();
    }
}
