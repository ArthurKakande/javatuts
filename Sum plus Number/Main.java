
import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int a = sc.nextInt();
//  int b = sc.nextInt();

  if (a < 1) {
    System.out.println("Invalid Input");
  }
  else {
    System.out.println(summing(a));
  } 

  }

  private static int summing(int a) {
    int sum = 0;
    for (int i = 1; i <=a; i++) {
      sum = sum + i;
    }
    return sum;
  }
}