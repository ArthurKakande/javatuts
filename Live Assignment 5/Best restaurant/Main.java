public class Main {
  public static void main(String[] args){
    Restaurant[] restaurants = {
      new Restaurant("McDonalds", 4.5),
      new Restaurant("Burger King", 3.5),
      new Restaurant("Wendys", 4.0),
      new Restaurant("Taco Bell", 3.5),
      new Restaurant("Chick-Fil-A", 4.0),
      new Restaurant("Pizza Hut", 4.5),
      new Restaurant("Domino's", 6.0),
      new Restaurant("Subway", 4.5),
      new Restaurant("Starbucks", 4.0),
      new Restaurant("Panda Express", 4.5),
      new Restaurant("KFC", 4.0),
      new Restaurant("Pizza Express", 4.5),
      new Restaurant("Chinese Restaurant", 4.0),
      new Restaurant("Sushi Restaurant", 4.5),
      new Restaurant("Thai Restaurant", 4.0),
      new Restaurant("Italian Restaurant", 4.5),
      new Restaurant("Mexican Restaurant", 4.0)
    };


    // Find the restaurant with the highest rating
    Restaurant best = FindBest(restaurants);
    if (best != null){
      System.out.println("The tastiest restaurant is " + best.getName() + " with a rating of " + best.getRating());
    } else{
      System.out.println("No restaurant found.");
    }
    
  }

  public static Restaurant FindBest(Restaurant [] restaurants){
    if (restaurants==null || restaurants.length==0){
      return null;
    }
    Restaurant bestrestaurant = restaurants[0];

    for (int i=1; i<restaurants.length; i++){
      if (restaurants[i].getRating()>bestrestaurant.getRating()){
        bestrestaurant = restaurants[i];
      }
    }
    return bestrestaurant;
  }
}