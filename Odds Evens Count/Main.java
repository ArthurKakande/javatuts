import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        int[] numbersArray = new int[5];
        System.out.print("Input: ");
        for (int i = 0; i < 5; i++) {
          numbersArray[i] = sc.nextInt();
        }

        //counting eves and odds
        int evesCount = 0;
        int oddsCount = 0;
        for(int number:numbersArray){
          if(number%2==0){
            evesCount++;
          }else{
            oddsCount++;
          }
        }
        //printing results
        System.out.println("Even: " +evesCount);
        System.out.println("Odd: " +oddsCount);

        // Close Scanner
        sc.close();
    }
    
}


