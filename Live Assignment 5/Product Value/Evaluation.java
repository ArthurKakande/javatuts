import java.util.ArrayList;

public class Evaluation {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(new Product("Coca cola", "Soft drinks", 5.0));
    products.add(new Product("Pepsi", "Soft drinks", 5.0));
    products.add(new Product("Sprite", "Soft drinks", 5.0));
    products.add(new Product("Mineral water", "Other drinks", 2.0));
    products.add(new Product("Orange juice", "Other drinks", 3.0));


  double softdrinktot = calculateTotalValue("Soft drinks", products);
    System.out.println("Total value for softdrinks is "+softdrinktot);
  }

  public static double calculateTotalValue(String category, ArrayList<Product> products){
    double totalValue = 0.0;
    for (Product product : products){
      if (product.category.equals(category)){
        totalValue += product.price;
      }
    }
    return totalValue;
  }
}