import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Input: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Read array elements from the user
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the greatest index where array[index] == index
        int result = findIndexEqualToValue(array);

        // Display the result
        if (result != -1) {
            System.out.println("Output: " + result);
        } else {
            System.out.println("Output: No Index Found");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }

    // Function to find the greatest index where array[index] == index
    private static int findIndexEqualToValue(int[] array) {
        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                result = i;
            }
        }

        return result;
    }
}




