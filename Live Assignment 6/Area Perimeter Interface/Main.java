public class Main implements MyShape {
  //implementing  abstract methods
  @Override
  public double calculateArea(){
    return 0.0;
  }
  
  @Override
  public double calculatePerimeter(){
    return 0.0;
  }

  public static void main(String[] args) {

    Main mainInstance = new Main();

    double area = mainInstance.calculateArea();
    double perimeter = mainInstance.calculatePerimeter();

    //print results
    System.out.println("Area is " +area);
    System.out.println("Perimeter is " +perimeter);
  }
}