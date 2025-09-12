package model;

public class Product extends Item {
    private String category;
    private double price;
    private double discount;
    private String type;
    private double rating;

    public Product(int id, String name, String category, double price, String type, double discount, double rating) {
        super(id, name);
        this.category = category;
        this.price = price;
        this.type = type;
        this.discount = discount;
        this.rating = rating;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void setDiscount(double discount) { this.discount = discount; }
    public double getDiscount() { return discount; }

    public double getFinalPrice() {
        return price - (price * discount / 100);
    }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    



    @Override
    public void display() {
        System.out.println("ID: " + getId() + ", Name: " + getName() +
            ", Category: " + category + ", Price: " + price);
    }
}