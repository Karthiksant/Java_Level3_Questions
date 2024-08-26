package TCS_NQT_QUE;
public class longestcommonsubsequence2 {
	public static int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        // Initializing 2D array for storing LCS lengths
        int[][] dp = new int[n + 1][m + 1];
        for (int idx1=1; idx1<n+1; idx1++) {
            for (int idx2=1;idx2<m + 1;idx2++) {
                // If matching
                if (text1.charAt(idx1 - 1) == text2.charAt(idx2 - 1))
                    dp[idx1][idx2] = 1 + dp[idx1 - 1][idx2 - 1];
                // Not matching
                else
                    dp[idx1][idx2] = Math.max(dp[idx1][idx2 - 1], dp[idx1 - 1][idx2]);
            }
        }
        // Reconstruct LCS string
        StringBuilder lcs = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                lcs.append(text1.charAt(i - 1));
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
        System.out.println("Length of LCS is " + dp[n][m]);
        System.out.println("LCS is " + lcs.toString());
        return dp[n][m];
    }
    public static void main(String[] args) {
        String S1 = "aabcccddx";
        String S2 = "sdcccss";
        // Function call
        longestCommonSubsequence(S1, S2);
    }
}
