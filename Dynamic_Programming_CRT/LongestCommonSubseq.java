public class LongestCommonSubseq {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] dp = new int[t2.length() + 1][t1.length() + 1];

        for (int i = 1; i <= t2.length(); i++) {
            for (int j = 1; j <= t1.length(); j++) {

                if (t2.charAt(i - 1) == t1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }

        return dp[t2.length()][t1.length()];
    }
}
