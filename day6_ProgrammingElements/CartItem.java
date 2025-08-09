package day6_ProgrammingElements;

import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return itemName + " - $" + price + " x " + quantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total cost: $" + total);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : items) {
                System.out.println(item);
            }
        }
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Laptop", 800, 1));
        cart.addItem(new CartItem("Mouse", 20, 2));
        cart.addItem(new CartItem("Headphones", 50, 1));

        System.out.println("Cart contents:");
        cart.displayCart();

        cart.displayTotalCost();

        System.out.println("\nRemoving 'Mouse' from cart...");
        cart.removeItem("Mouse");

        System.out.println("Updated cart:");
        cart.displayCart();
        cart.displayTotalCost();
    }
}

