import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read in an integer number (> 0)
        System.out.print("Size: ");
        int size = sc.nextInt();

        // Read in a second value for the seed
        System.out.print("Seed: ");
        int seed = sc.nextInt();

        // Create an array of size 'number' and fill it with random numbers
        int[] field = new int[size];
        Random random = new Random(seed);

        System.out.println("Created Array:");
        for (int i = 0; i < size; i++) {
            field[i] = random.nextInt() % 100; 
            System.out.print(field[i] + " ");
        }
        System.out.println();

        // Count the number of negative and positive numbers in the array
        int negatives = 0;
        int positives = 0;

        for (int number : field) {
            if (number < 0) {
                negatives++;
            } else if (number > 0) {
                positives++;
            }
        }

        // Display the result
        System.out.println("Negatives: " + negatives);
        System.out.println("Positives: " + positives);

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}



