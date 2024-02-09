import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner sc = new Scanner(System.in);

        // Read a word from the user
        System.out.print("Enter a word: ");
        String inputWord = sc.nextLine();

        // Read a sequence of integers from the user
        System.out.print("Enter Integers separated by spaces: ");
        String[] sequenceInput = sc.nextLine().split(" ");
        int[] sequence = new int[sequenceInput.length];

        // Convert the sequence input to an array of integers
        for (int i = 0; i < sequenceInput.length; i++) {
            sequence[i] = Integer.parseInt(sequenceInput[i]);
        }

        // Call the rearrange method and display the result
        String result = rearrange(inputWord, sequence);
        System.out.println("Output: " + result);

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Method to rearrange characters in a word based on a sequence of indices
    public static String rearrange(String word, int[] sequence) {
        // Check for invalid indices in the sequence
        for (int index : sequence) {
            if (index < 0 || index >= word.length()) {
                return "Invalid Sequence";
            }
        }

        // Create a StringBuilder to efficiently build the rearranged word
        StringBuilder rearrangedWord = new StringBuilder();

        // Append characters to the StringBuilder based on the sequence
        for (int index : sequence) {
            rearrangedWord.append(word.charAt(index));
        }

        return rearrangedWord.toString();
    }
}













