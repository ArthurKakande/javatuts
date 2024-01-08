import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        int x = sc.nextInt();

        // Invert the number digit by digit
        int invertedNumber = invertDigits(x);

        // Display the result
        System.out.println("Output: " + invertedNumber);

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Function to invert the digits of a number
    private static int invertDigits(int number) {
        int invertedNumber = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            invertedNumber = invertedNumber * 10 + digit; // Append the digit to the inverted number
            number /= 10; // Remove the last digit from the original number
        }

        return invertedNumber;
    }
}





