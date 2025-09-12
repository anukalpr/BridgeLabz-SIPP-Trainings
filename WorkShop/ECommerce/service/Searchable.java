package service;

import model.Product;
import java.util.List;

public interface Searchable {
    List<Product> searchByName(String name);
    List<Product> searchByCategory(String category);
}