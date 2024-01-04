
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
    System.out.println(sumbetweennumbers(a, b));
  } 

  }

  private static int sumbetweennumbers(int a, int b) {
    int sum = 0;
    for (int i = a; i <=b; i++) {
      sum = sum + i;
    }
    return sum;
  }
}