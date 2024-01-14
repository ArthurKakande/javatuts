import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read an int number 'a'
        System.out.print("Input: ");
        int a = sc.nextInt();

        // Preset a double variable 'x' with the value 2
        double x = 2.0;

        // Perform Heron's method for 10 iterations
        System.out.print("Output: ");
        for (int i = 0; i < 10; i++) {
            // Output the current value of x
            System.out.print(x + " ");

            // Redefine x using the Heron's method formula
            x = (x + a / x) / 2;
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}






