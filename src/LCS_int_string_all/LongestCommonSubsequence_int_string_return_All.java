package LCS_int_string_all;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubsequence_int_string_return_All {

    // Function to compute all common subsequences
    public static Set<String> allCommonSubsequences(String text1, String text2) {
        int n = text1.length(); // Length of the first string
        int m = text2.length(); // Length of the second string

        // Initializing 2D array for storing LCS lengths
        int[][] dp = new int[n + 1][m + 1];
        // dp[i][j] will store the length of LCS of text1[0..i-1] and text2[0..j-1]

        // Fill the DP table
        for (int idx1 = 1; idx1 <= n; idx1++) { // Iterate over each character of text1
            for (int idx2 = 1; idx2 <= m; idx2++) { // Iterate over each character of text2
                if (text1.charAt(idx1 - 1) == text2.charAt(idx2 - 1))
                    // If characters match, include this character in LCS
                    dp[idx1][idx2] = 1 + dp[idx1 - 1][idx2 - 1];
                else
                    // If they don't match, take the maximum LCS length from either skipping the character from text1 or text2
                    dp[idx1][idx2] = Math.max(dp[idx1][idx2 - 1], dp[idx1 - 1][idx2]);
            }
        }

        // Set to store all common subsequences (avoiding duplicates)
        Set<String> subsequences = new HashSet<>();

        // Function to recursively collect all subsequences
        collectSubsequences(text1, text2, n, m, dp, "", subsequences);

        // Return the set of all common subsequences
        return subsequences;
    }

    // Helper function to collect all common subsequences
    private static void collectSubsequences(String text1, String text2, int i, int j, int[][] dp, String current, Set<String> subsequences) {
        if (i == 0 || j == 0) { // Base case: if we've reached the beginning of either string
            if (!current.isEmpty()) { // If the current subsequence isn't empty, add it to the set
                subsequences.add(new StringBuilder(current).reverse().toString()); // Reverse and add the subsequence
            }
            return; // End the recursion
        }

        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
            // If characters match, include this character in the subsequence
            collectSubsequences(text1, text2, i - 1, j - 1, dp, text1.charAt(i - 1) + current, subsequences);
        } else {
            // If characters don't match, explore both possibilities (skip from text1 or skip from text2)
            if (dp[i - 1][j] >= dp[i][j - 1]) { // If skipping from text1 gives a longer or equal LCS
                collectSubsequences(text1, text2, i - 1, j, dp, current, subsequences);
            }
            if (dp[i][j - 1] >= dp[i - 1][j]) { // If skipping from text2 gives a longer or equal LCS
                collectSubsequences(text1, text2, i, j - 1, dp, current, subsequences);
            }
        }
    }

    public static void main(String[] args) {
        String S1 = "abcde"; // Define the first string
        String S2 = "abdfe"; // Define the second string

        // Function call to get all common subsequences
        Set<String> subsequences = allCommonSubsequences(S1, S2);

        // Print all common subsequences
        System.out.println("All common subsequences are:");
        for (String subseq : subsequences) { // Iterate over each subsequence
            System.out.println(subseq); // Print the subsequence
        }
    }
}
