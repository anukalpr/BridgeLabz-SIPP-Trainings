package service;

import model.Product;
import java.util.*;

public class ProductService implements Searchable {
    private Map<Integer, Product> productMap = new HashMap<>();

    public ProductService() {
        // Electronics
        addProduct(new Product(1001, "iPhone 14", "Electronics", 79999, "Mobile", 10.0, 4.5));
        addProduct(new Product(1003, "Sony Headphones", "Electronics", 3499, "Audio", 20.0, 4.6));
        addProduct(new Product(1006, "Samsung Smart TV", "Electronics", 45999, "Television", 18.0, 4.4));

        // Footwear
        addProduct(new Product(1002, "Nike Shoes", "Footwear", 5999, "Shoes", 15.0, 4.2));
        addProduct(new Product(1007, "Adidas Flip Flops", "Footwear", 1999, "Casual", 10.0, 4.0));

        // Computers
        addProduct(new Product(1004, "HP Laptop", "Computers", 55999, "Laptop", 5.0, 4.4));
        addProduct(new Product(1008, "Logitech Mouse", "Computers", 899, "Accessories", 12.0, 4.3));

        // Accessories
        addProduct(new Product(1005, "Leather Wallet", "Accessories", 999, "Wallet", 25.0, 4.1));
        addProduct(new Product(1009, "Fossil Watch", "Accessories", 7999, "Watch", 30.0, 4.7));

        // Clothing
        addProduct(new Product(1010, "Levi's Jeans", "Clothing", 2499, "Denim", 15.0, 4.3));
        addProduct(new Product(1011, "Zara T-Shirt", "Clothing", 1299, "Casual Wear", 20.0, 4.2));

        // Books
        addProduct(new Product(1012, "Java Programming", "Books", 599, "Education", 10.0, 4.8));
        addProduct(new Product(1013, "Harry Potter", "Books", 699, "Fiction", 5.0, 4.9));

        // Home Appliances
        addProduct(new Product(1014, "Philips Mixer", "Home Appliances", 3499, "Kitchen", 18.0, 4.5));
        addProduct(new Product(1015, "Dyson Vacuum", "Home Appliances", 29999, "Cleaning", 22.0, 4.6));

        // Sports
        addProduct(new Product(1016, "Yonex Badminton Racket", "Sports", 1599, "Rackets", 15.0, 4.4));
        addProduct(new Product(1017, "Nivia Football", "Sports", 999, "Ball", 10.0, 4.2));
    }

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public void updateProduct(int id, Product updated) {
        if (productMap.containsKey(id)) {
            productMap.put(id, updated);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        productMap.remove(id);
    }

    public void displayAllProducts() {
        for (Product product : productMap.values()) {
            product.display();
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> results = new ArrayList<>();
        for (Product p : productMap.values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                results.add(p);
            }
        }
        return results;
    }

    @Override
    public List<Product> searchByCategory(String category) {
        List<Product> results = new ArrayList<>();
        for (Product p : productMap.values()) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                results.add(p);
            }
        }
        return results;
    }

    public List<Product> sortByName() {
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(Comparator.comparing(Product::getName));
        return list;
    }

    public List<Product> sortByPrice() {
        List<Product> list = new ArrayList<>(productMap.values());
        list.sort(Comparator.comparingDouble(Product::getPrice));
        return list;
    }

    public void findProductPairsWithinBudget(double budget) {
        List<Product> products = new ArrayList<>(productMap.values());
        products.sort(Comparator.comparingDouble(Product::getPrice));

        int left = 0, right = products.size() - 1;
        boolean found = false;
        while (left < right) {
            double sum = products.get(left).getPrice() + products.get(right).getPrice();
            if (sum == budget) {
                System.out.println("Pair: ");
                products.get(left).display();
                products.get(right).display();
                found = true;
                left++;
                right--;
            } else if (sum < budget) {
                left++;
            } else {
                right--;
            }
        }
        
        if (!found) System.out.println("No matching pairs found.");
    }
}
