public class Restaurant {
  private String name;
  private double rating;

  public Restaurant(String name, double rating){
    this.name = name;
    this.rating = Math.max(0, Math.min(5, rating));
  }

  public String getName(){
    return name;
  }

  public double getRating(){
    return rating;
  }
}