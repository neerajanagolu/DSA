package DP;

public class FrogJump_DP2 {
    //int op=Integer.MAX_VALUE;

// tabulation
    /*
    public static void main(String[] args)
    {

                int[] height = {20, 30, 40, 20};
                int n = height.length;
                int[] dp = new int[n];
                dp[0] = 0;

                //dp[1]=Math.abs(height[0] - height[1]);
                for (int i = 1; i < n; i++) {
                    int twoStep=Integer.MAX_VALUE;
                    int oneStep = dp[i - 1] + Math.abs(height[i] - height[i - 1]);

                    if (i > 1)
                     twoStep = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
                    dp[i] = Math.min(oneStep, twoStep);
                }

                System.out.println("Minimum energy: " + dp[n - 1]);






    }
}
*/

    //recursion
/*
int f(int [] height,int n)
   {
       if(n<=0)
           return 0;
       if(n==1)
           return Math.abs(height[1]-height[0]);
       int l=f(height,n-1)+Math.abs(height[n]-height[n-1]);
       int r=f(height,n-2)+Math.abs(height[n]-height[n-2]);
       int op=Math.min(l,r);
      return op;

    }
 */
//memoization
/*
public class FrogJump_DP2 {
    //int op=Integer.MAX_VALUE;
   int f(int [] height,int n,int []dp)
   {
       if(n<=0)
           return 0;
       if(n==1)
           return Math.abs(height[1]-height[0]);
       if(dp[n]!=-1)
           return dp[n] ;
       int l=f(height,n-1,dp)+Math.abs(height[n]-height[n-1]);
       int r=f(height,n-2,dp)+Math.abs(height[n]-height[n-2]);
       int op=Math.min(l,r);
      return dp[n]=op;

    }
    public static void main(String[] args)

    {
        int []a={20,30,40,20};
        int i=4;
        int [] dp=new int[5];
        for(int j=0;j<dp.length;j++)
            dp[j]=-1;
        FrogJump_DP2 obj=new FrogJump_DP2();
        int ans=obj.f(a,a.length-1,dp);
        System.out.print(ans);


    }
}
 */
// space optimization
    public static void main(String[] args) {
        int[] a = {20, 30, 40, 20};
        int n = 4;
        int prev1 = 0;
        int prev2 = 0;
        int curr = 0;
        int i;
        for (i = 1; i < n; i++) {
            int r = Integer.MAX_VALUE;
            int l = prev1 + Math.abs(a[i] - a[i - 1]);
            if (i > 1)
                r = prev2 + Math.abs(a[i] - a[i - 2]);
            curr = Math.min(l, r);
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.print(prev1);
    }
}
