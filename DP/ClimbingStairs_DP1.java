package DP;

public class ClimbingStairs_DP1 {
    public int climbStairs(int n,int dp[]) {

            if(n==0)
                return 1;
            else
            {
                if(n<0)
                    return 0;
            }
            if(dp[n]!=-1)return dp[n];
            int l=climbStairs(n-2,dp);
            int r=climbStairs(n-1,dp);

            return dp[n]=l+r;


        }
        public static void main(String[] args)
        {
            int n=3;
            int  [] dps=new int [n+1];

            ClimbingStairs_DP1 obj =new ClimbingStairs_DP1();
            for(int i=0;i<dps.length;i++)dps[i]=-1;

            System.out.println(obj.climbStairs( n,dps));

    }
}
