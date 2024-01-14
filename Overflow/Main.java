public class Main {
    public static void main(String[] args) {
        // Find the smallest positive int number n causing overflow during squaring
        int n = 1;

        while (true) {
            // Check for overflow by comparing with max and min int values
            if (n > 0 && Integer.MAX_VALUE / n < n) {
                // Overflow occurs
                System.out.println("First overflow during squaring occurs at " + n);
                break;
            }

            // If no overflow, update n and continue
            n++;
        }
    }
}








