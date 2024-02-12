public class Main{
  public static void main(String[] args){
    String productString1 = "12345;Smartphone;399.99";
    String productString2 = "12;Smartphone;399.99";
    String productString3 = "2;Smartphone;399.99";
    String productString4 = "12345;;399.99";
    String productString5 = ";;399.99";

    // Parse product strings
    Product product1 = parse(productString1);
    Product product2 = parse(productString2);
    Product product3 = parse(productString3);
    Product product4 = parse(productString4);
    Product product5 = parse(productString5);

    //display
    display(product1);
    display(product2);
    display(product3);
    display(product4);
    display(product5);

  }

  public static Product parse(String productstring){
    String[] parts = productstring.split(";");
    // Set default values in case of missing or incorrect information
    int id = (parts.length > 0 && parts[0].length() >= 5) ? Integer.parseInt(parts[0]) : -1;
    String name = (parts.length > 1 && !parts[1].isEmpty()) ? parts[1] : "Unknown";
    double price = (parts.length > 2 && !parts[2].isEmpty()) ? Double.parseDouble(parts[2]) : 0.0;

    return new Product(name, id, price);

  }

  //display results
  public static void display(Product product){
    System.out.println("Product ID: " + product.getId());
    System.out.println("Product Name: " + product.getName());
    System.out.println("Product Price: " + product.getPrice());
    System.out.println();
  }
}