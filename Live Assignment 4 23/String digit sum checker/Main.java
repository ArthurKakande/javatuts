import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Input string: ");
        String inputString = sc.nextLine();

        // Call the addDigits method and display the result
        int digitSum = addDigits(inputString);
        System.out.println("The sum of digits in the string is: " + digitSum);

        // Call the containsSum method and display the result
        boolean containsSum = containsSum(inputString);
        if (containsSum) {
            System.out.println("The value " + digitSum + " is contained in the string.");
        } else {
            System.out.println("The value " + digitSum + " is not contained in the string.");
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Method to add up all digits in a string
    public static int addDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

    // Method to check if the sum of digits is contained in the string
    public static boolean containsSum(String str) {
        int digitSum = addDigits(str);

        // Convert digitSum to a string for easy check
        String digitSumStr = Integer.toString(digitSum);

        return str.contains(digitSumStr);
    }
}














