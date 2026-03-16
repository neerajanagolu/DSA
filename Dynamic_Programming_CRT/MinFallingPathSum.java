import java.util.*;
public class MinFallingPathSum {
    public int minFallingPathSum(int[][] m) {
        int n = m.length;

        int[][] dp = new int[n][n + 2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < n; i++) {
            dp[0][i + 1] = m[0][i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = m[i][j - 1] + Math.min(dp[i - 1][j - 1],
                        Math.min(dp[i - 1][j], dp[i - 1][j + 1]));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int val : dp[n - 1]) {
            ans = Math.min(ans, val);
        }

        return ans;
    }
}
