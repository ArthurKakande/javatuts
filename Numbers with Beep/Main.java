import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Input: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // Store the output in an array
        String[] outputArray = generateBeep(n, m, k);

        // Output the result
        System.out.print("Output: ");
        for (String element : outputArray) {
            System.out.print(element + " ");
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Function to generate the array of numbers with "beep" for multiples of k
    private static String[] generateBeep(int n, int m, int k) {
        String[] outputArray = new String[Math.abs(m - n) + 1];
        int index = 0;

        // Adjust the loop based on n and m
        if (n <= m) {
            for (int i = n; i <= m; i++) {
                outputArray[index++] = (i % k == 0) ? "beep" : Integer.toString(i);
            }
        } else {
            for (int i = n; i >= m; i--) {
                outputArray[index++] = (i % k == 0) ? "beep" : Integer.toString(i);
            }
        }

        return outputArray;
    }
}


