public class Main {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {28, 22, 17, 19},
            {18, 27, 20, 43},
            {0, 0, 1, 1}
        };

        int minRowIndex = minSum(array);
        System.out.println("Row with the lowest sum: " + minRowIndex);
    }

    // Method to find the index of the row with the lowest sum
    public static int minSum(int[][] a) {
        int minSum = Integer.MAX_VALUE;
        int minRowIndex = -1;

        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;

            // Calculate the sum of the current row
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }

            // Update the minimum sum and index if needed
            if (rowSum < minSum) {
                minSum = rowSum;
                minRowIndex = i;
            }
        }

        return minRowIndex;
    }
}










