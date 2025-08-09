package day7_ProgrammingElements;

class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public Product(String productName) {
        this(productName, 0.0);
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventoryApp {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Mouse", 25);
        Product p3 = new Product("Keyboard");

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
