import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read an int number from the user
        System.out.print("Input: ");
        int n = sc.nextInt();

        // Generate the pattern
        generatePattern(n);

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Function to generate the specified pattern
    private static void generatePattern(int n) {
        // Loop to iterate through each row
        for (int i = 0; i < n; i++) {
            // Loop to print 'X' characters
            for (int j = 0; j < n - i; j++) {
                System.out.print("X");
            }

            // Loop to print 'o' characters
            for (int k = 0; k < i; k++) {
                System.out.print("o");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}









