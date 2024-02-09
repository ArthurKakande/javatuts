import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example usage
        System.out.println(countUniqueWords("This is an example")); // Output: 4
        System.out.println(countUniqueWords("This this is is a Test")); // Output: 4
        System.out.println(countUniqueWords("Computer Science is Is iS fun")); // Output: 4
    }

    // Method to count unique words in a sentence
    static int countUniqueWords(String s) {
        // Split the sentence into words using blank space as a delimiter
        String[] words = s.split("\\s+");

        // Create a List to store unique words (case-insensitive)
        List<String> uniqueWords = new ArrayList<>();

        // Count unique words
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            // Check if the word is not already in the list
            if (!uniqueWords.contains(lowercaseWord)) {
                uniqueWords.add(lowercaseWord);
            }
        }

        return uniqueWords.size();
    }
}
