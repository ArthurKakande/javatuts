import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter a string to reverse: ");
        String inputString = sc.nextLine();

        // Reverse the string using the recursive method
        String reversedString = reverse(inputString);

        // Display the reversed string
        System.out.println("Output: Reversed string: " + reversedString);

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Recursive method to reverse a string
    public static String reverse(String string) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (string.length() <= 1) {
            return string;
        }

        // Recursive case: reverse the substring excluding the first character,
        // and append the first character at the end
        return reverse(string.substring(1)) + string.charAt(0);
    }
}












