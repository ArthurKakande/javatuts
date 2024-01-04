
import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int a = sc.nextInt();
  int b = sc.nextInt();

  if (a > b) {
    System.out.println("Invalid Input");
  }
  else {
    for (int i = b-1; i > a; i--){
      System.out.println(i);
    }
    
  }

  sc.close();

  }


}