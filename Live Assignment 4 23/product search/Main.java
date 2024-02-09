public class Main{
  public static void main(String[] args){
    Product[] products = {
        new Product("Product1", "Brand1", 10.99),
        new Product("Product2", "Brand2", 19.99),
        new Product("Product3", 15.99),
    };

    String searchName = "Product4";
    Product foundProduct = Product.search(searchName, products);

    if (foundProduct != null) {
      System.out.println("Product found: " + foundProduct.getName());
      System.out.println("Brand: " + foundProduct.getBrandName());
      System.out.println("Price: $" + foundProduct.getPrice());
    } else {
      System.out.println("Product not found: " + searchName);
    }
  }
}















