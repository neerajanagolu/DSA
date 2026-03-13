public class FrogJumpWithKDistances {
    public int frogJump(int[] height, int k) {

        int n = height.length;

        int dp[] = new int[n];

        dp[0] = 0;

        for(int i = 1; i < n; i++) {

            dp[i] = Integer.MAX_VALUE;

            for(int j = 1; j <= k; j++) {

                if(i - j >= 0) {
                    int jump = dp[i-j] + Math.abs(height[i] - height[i-j]);
                    dp[i] = Math.min(dp[i], jump);
                }
            }
        }

        return dp[n-1];
    }
}
