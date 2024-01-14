import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read the size of the arrays
        System.out.print("Array/Vector size: ");
        int size = sc.nextInt();

        // Create arrays for vectors a and b
        int[] a = new int[size];
        int[] b = new int[size];

        // Read values for vector a
        System.out.print("Input a: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Read values for vector b
        System.out.print("Input b: ");
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();
        }

        // Calculate the scalar product
        int scalarProduct = calculateScalarProduct(a, b);

        // Print result
        System.out.println("Output: ~a ◦ ~b = " + scalarProduct);

        // Close the Scanner
        sc.close();
    }

    // Function to calculate the scalar product of two vectors
    private static int calculateScalarProduct(int[] a, int[] b) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }

        return result;
    }
}







