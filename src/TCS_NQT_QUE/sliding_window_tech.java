package TCS_NQT_QUE;

import java.util.Scanner;

public class sliding_window_tech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the entire input line, assuming it's space-separated
        String[] input = scanner.nextLine().split(" ");
        String str = input[0]; // First part is the string
        int L = Integer.parseInt(input[1]); // Second part is the integer L

        int maxAquaCurtains = maxAquaCurtains(str, L);
        System.out.println(maxAquaCurtains);

        scanner.close(); // Close the scanner to release resources
    }

    public static int maxAquaCurtains(String str, int L) {
        int maxCount = 0;
        // Check if L is greater than the length of the string
        if (L > str.length()) {
            return 0; // If L is greater, no segments of length L can exist
        }
        // Iterate over segments of length L in the string
        for (int i = 0; i <= str.length() - L; i++) {
            int count = 0;
            for (int j = i; j < i + L; j++) {
                if (str.charAt(j) == 'a') {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
