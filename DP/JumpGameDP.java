import java.util.Arrays;

public class JumpGameDP {
    public static boolean jump(int []a,boolean dp[])
    {
        int n = a.length;
      //  boolean[] dp = new boolean[n];

        // Last index is always reachable from itself
        dp[n - 1] = true;

        // Traverse backwards
        for (int i = n - 2; i >= 0; i--) {

            // Check all reachable positions from i
            for (int j = i + 1; j <= i + a[i] && j < n; j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break; // no need to check further
                }
            }
        }

        return dp[0];
    }
    public static void main(String [] args)
    {
        int []arr={3,2,1,0,4};
      //  int []arr={2,3,1,1,4};
       boolean dp[]=new boolean[arr.length];
        Arrays.fill(dp, false);
       System.out.println( jump(arr,dp));
    }
}
