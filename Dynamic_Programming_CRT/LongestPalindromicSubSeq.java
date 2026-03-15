public class LongestPalindromicSubSeq {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        String x = new StringBuilder(s).reverse().toString();

        for (int i = 1; i <= x.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {

                if (x.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }

        return dp[n][n];
    }
}
