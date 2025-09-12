package utils;

import model.Product;
import java.util.List;

public class CatalogUtils {
    public static void displayProducts(List<Product> products) {
        for (Product p : products) {
            p.display();
        }
    }
}