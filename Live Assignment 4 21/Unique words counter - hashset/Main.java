import java.util.HashSet;

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

        // Create a HashSet to store unique words (case-insensitive)
        HashSet<String> uniqueWords = new HashSet<>();

        // Count unique words
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        return uniqueWords.size();
    }
}
