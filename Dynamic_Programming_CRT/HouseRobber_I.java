public class HouseRobber_I {
    public int rob(int a[]) {
        // code here

        int n=a.length;

        if(a.length==1)
            return a[0];

        if(a.length==2)
            return Math.max(a[0],a[1]);

        int dp[]=new int[n];
        dp[0]=a[0];
        dp[1]=Math.max(a[0],a[1]);
        int max=-1;

        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]);
        }
        return dp[n-1];
    }
}
