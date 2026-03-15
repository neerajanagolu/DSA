public class EditDistance {
    public int minDistance(String w1, String w2) {
        int[][] dp = new int[w2.length() + 1][w1.length() + 1];

        for (int i = 0; i <= w2.length(); i++) {
            for (int j = 0; j <= w1.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for (int i = 1; i <= w2.length(); i++) {
            for (int j = 1; j <= w1.length(); j++) {
                if (w1.charAt(j - 1) == w2.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],
                            Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        return dp[w2.length()][w1.length()];
    }
}
