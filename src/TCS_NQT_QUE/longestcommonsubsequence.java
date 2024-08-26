package TCS_NQT_QUE;

public class longestcommonsubsequence {
    public static int longestCommonSubsequence(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        // Initializing 2D array for storing LCS lengths
        int[][] dp = new int[l1 + 1][l2 + 1];

        // Iterate through each character of both strings
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                // If characters match, add 1 to the previous diagonal value
                if (s1.charAt(i) == s2.charAt(j))
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                // If characters do not match, take the maximum value from left or above
                else
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }

        // Reconstruct LCS string
        StringBuilder lcs = new StringBuilder();
        int i = l1, j = l2;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Since we built the LCS backwards, reverse it
        lcs.reverse();

        System.out.println("Length of LCS is " + dp[l1][l2]);
        System.out.println("LCS is " + lcs.toString());

        return dp[l1][l2];
    }

    public static void main(String[] args) {
        String S1 = "aabcccddx";
        String S2 = "sdcccss";

        // Function call
        longestCommonSubsequence(S1, S2);
    }
}
