
import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int a = sc.nextInt();
  int b = sc.nextInt();

  if (a < b) {
    System.out.println("a is less than b");
  }
  else if (a == b) {
    System.out.println("a is equal to b");
  }
  else {
    System.out.println("a is greater than b");
  }

  }
}