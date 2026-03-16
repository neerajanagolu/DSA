import java.util.*;
public class TriangleDP {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();

        int[][] dp = new int[n][];
        for (int i = 0; i < n; i++) {
            dp[i] = new int[t.get(i).size()];
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        dp[0][0] = t.get(0).get(0);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < t.get(i).size(); j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], t.get(i + 1).get(j) + dp[i][j]);
                dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], t.get(i + 1).get(j + 1) + dp[i][j]);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int val : dp[n - 1]) {
            ans = Math.min(ans, val);
        }

        return ans;

    }
}
