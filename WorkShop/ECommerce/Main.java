import service.Searchable;
import service.ProductService;
import utils.CatalogUtils;
import model.Item;


import model.Product;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Display All\n5. Search by Name\n6. Search by Category\n7. Sort by Name\n8. Sort by Price\n9. Find Pairs in Budget\n0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

    switch (choice) {
        case 1: // Add Product
            System.out.print("Enter Product ID: ");
            int newId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Product Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Product Discount (%): ");
            double discount = sc.nextDouble();

            System.out.print("Enter Product Rating (out of 5): ");
            double rating = sc.nextDouble();

            Product p = new Product(newId, name, category, price, "General", discount, rating);
            service.addProduct(p);
            break;

        case 2: // Update Product
            System.out.print("Enter ID to update: ");
            int updateId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter New Product Name: ");
            String newName = sc.nextLine();

            System.out.print("Enter New Category: ");
            String newCategory = sc.nextLine();

            System.out.print("Enter New Price: ");
            double newPrice = sc.nextDouble();

            System.out.print("Enter New Discount (%): ");
            double newDiscount = sc.nextDouble();

            System.out.print("Enter New Rating: ");
            double newRating = sc.nextDouble();

            Product updatedProduct = new Product(updateId, newName, newCategory, newPrice, "General", newDiscount, newRating);
            service.updateProduct(updateId, updatedProduct);
            break;

        case 3: // Delete Product
            System.out.print("Enter ID to delete: ");
            int deleteId = sc.nextInt();
            service.deleteProduct(deleteId);
            break;

        case 4: // Display All
            service.displayAllProducts();
            break;

        case 5: // Search by Name
            sc.nextLine(); // consume newline
            System.out.print("Enter name to search: ");
            String searchName = sc.nextLine();
            CatalogUtils.displayProducts(service.searchByName(searchName));
            break;

        case 6: // Search by Category
            sc.nextLine(); // consume newline
            System.out.print("Enter category to search: ");
            String searchCategory = sc.nextLine();
            CatalogUtils.displayProducts(service.searchByCategory(searchCategory));
            break;

        case 7: // Sort by Name
            CatalogUtils.displayProducts(service.sortByName());
            break;

        case 8: // Sort by Price
            CatalogUtils.displayProducts(service.sortByPrice());
            break;

        case 9: // Find Pairs in Budget
            System.out.print("Enter budget: ");
            double budget = sc.nextDouble();
            service.findProductPairsWithinBudget(budget);
            break;

        case 0: // Exit
            System.out.println("Thanks! Visit again!");
            return;

        default:
            System.out.println("Invalid Choice!");
    }
    }
}
}
