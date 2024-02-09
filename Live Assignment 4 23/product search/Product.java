public class Product {
private String name;
private String brandName;
private double price;

// Constructor with name, brand, and price
public Product(String name, String brandName, double price) {
    this.name = name;
    this.brandName = brandName;
    this.price = price;
}

// Constructor with name and price (default brandName is "Unknown")
public Product(String name, double price) {
    this(name, "Unknown", price);
}

// Getter methods
public String getName() {
    return name;
}

public String getBrandName() {
    return brandName;
}

public double getPrice() {
    return price;
}

// Method to search for a product by name in an array
public static Product search(String productName, Product[] products) {
    for (Product product : products) {
        if (product.getName().equals(productName)) {
            return product;
        }
    }
    return null;
}
}