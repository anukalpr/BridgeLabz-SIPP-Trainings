import java.util.ArrayList;
import java.util.List;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product implements Taxable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "Electronics tax rate: 18%";
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "Clothing tax rate: 5%";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    public double calculateTax() {
        return 0;
    }

    public String getTaxDetails() {
        return "No tax for groceries.";
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "Shirt", 2000));
        products.add(new Groceries(103, "Rice", 1500));

        for (Product product : products) {
            product.displayDetails();

            double discount = product.calculateDiscount();
            double tax = product.calculateTax();

            System.out.println(product.getTaxDetails());

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
        }
    }
}
