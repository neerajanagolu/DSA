import java.util.*;
public class CoinChange {
    public int coinChange(int[] coins, int amount) {


        Arrays.sort(coins);

        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i = 1; i <= amount; i++) {

            for(int c : coins) {

                if(i - c < 0)
                    break;

                if(dp[i-c] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i-c] + 1);
            }
        }

        if(dp[amount] == Integer.MAX_VALUE)
            return -1;

        return dp[amount];
    }
}
