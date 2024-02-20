import java.util.*;

public class Main {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      String input = sc.nextLine();

      try {
        //attempt to convert string
        double number = Double.parseDouble(input);

        //if successfulm print double
        System.out.println(number);
        break;
      } catch (NumberFormatException e) {
        System.out.println("Error invalid Input. Enter a number");
      }
    }

    //close sc
    sc.close();
  }
}