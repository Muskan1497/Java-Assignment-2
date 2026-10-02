import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Product class
class Product {
    private String productName;
    private double price;
    private int quantity;

    Product() {
    }

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + (price * quantity);
    }
}

// Order class
class Order {
    private String orderId;
    private List<Product> products;

    Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total = total + product.getPrice() * product.getQuantity();
        }

        return total;
    }

    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\n";
        result += "Products:\n";

        for (Product product : products) {
            result += product + "\n";
        }

        result += "Total: " + calculateTotal();

        return result;
    }
}

// Main class
public class OnlineShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Order order = new Order(orderId);

        for (int i = 0; i < n; i++) {

            System.out.println("Enter product details (Name,Price,Quantity):");

            String input = sc.nextLine();

            String[] data = input.split(",");

            String productName = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            Product product =
                    new Product(productName, price, quantity);

            order.addProduct(product);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}