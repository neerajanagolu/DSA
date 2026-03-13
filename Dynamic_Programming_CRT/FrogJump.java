public class FrogJump {

//USing Recursion
  static  int fun(int[] h, int i)
    {
        if(i >= h.length - 1)
            return 0;

        int jump1 = Math.abs(h[i] - h[i+1]) + fun(h, i+1);

        int jump2 = Integer.MAX_VALUE;
        if(i + 2 < h.length)
            jump2 = Math.abs(h[i] - h[i+2]) + fun(h, i+2);

        return Math.min(jump1, jump2);
    }

    //using memoization
    int minCost(int[] height) {
        // code here
        int [] dp=new int[height.length+1];
        for(int i=0;i<height.length;i++)
            dp[i]=-1;
       // Solution s=new Solution();
        int a= f(height,height.length-1,dp);
        return a;
    }

    static int f(int [] height,int n,int [] dp)
    {

        if(n<=0)
            return 0;
        if(n==1)
            return Math.abs(height[1]-height[0]);
        if(dp[n]!=-1)
            return dp[n];
        int l=f(height,n-1,dp)+Math.abs(height[n]-height[n-1]);
        int r=f(height,n-2,dp)+Math.abs(height[n]-height[n-2]);
        int op=Math.min(l,r);
        return dp[n]=op;
    }
    //using tabulation
    int minCost1(int[] height) {
        // code here

        if(height.length==1)
            return 0;
        if(height.length==2)
            return Math.abs(height[1]-height[0]);
        int n=height.length;
        int dp[]=new int[n];
        dp[1]=Math.abs(height[1]-height[0]);

        for(int i=2;i<n;i++)
        {
            dp[i] = Math.min(
                    dp[i-1] + Math.abs(height[i] - height[i-1]),
                    dp[i-2] + Math.abs(height[i] - height[i-2])
            );
        }
        //  return Math.min(dp[n-2]+Math.abs(height[n-1]-height[n-2]));
        return dp[n-1];
    }
}
