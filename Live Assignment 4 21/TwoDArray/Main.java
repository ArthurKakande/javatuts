import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example usage
        int[] arraySizes = {3, 1, 2, 1, 2};
        int[][] resultArray = createArray(arraySizes);

        // Display the generated two-dimensional array
        for (int[] row : resultArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Method to create a two-dimensional array based on the provided array sizes
    static int[][] createArray(int[] a) {
        // Create a two-dimensional array with the size of the "first" dimension as a.length
        int[][] resultArray = new int[a.length][];

        // Initialize each individual array in the "second" dimension with size defined by a[i]
        for (int i = 0; i < a.length; i++) {
            resultArray[i] = new int[a[i]];
        }

        return resultArray;
    }
}

