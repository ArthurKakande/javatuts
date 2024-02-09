import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read a non-negative integer from the user
        System.out.print("Input: ");
        int n = sc.nextInt();

        // Calculate and display the digit sum using the recursive method
        System.out.println("Output: Digit sum of " + n + " is " + ds(n));

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Recursive method to calculate the digit sum
    static int ds(int n) {
        // Base case: for numbers n with 0 ≤ n < 10, ds(n) = n
        if (n >= 0 && n < 10) {
            return n;
        }

        // Recursive case: for numbers n with n ≥ 10, ds(n) = n%10 + ds(n/10)
        return n % 10 + ds(n / 10);
    }
}











