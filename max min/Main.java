
import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int a = sc.nextInt();
  int b = sc.nextInt();

  int min = min(a, b);
  System.out.println("Minimum:" + min);

  int max = max(a, b);
  System.out.println("Maximum:" + max);
  
  }

  private static int min(int x, int y){
    return (x < y) ? x : y;
  }

  private static int max(int x, int y){
    return (x > y) ? x : y; 
  }


}