package DP;

public class FrogJumpK_DP4 {
    public int frogJump(int[] heights, int k) {
       //Solution s=new Sol ution();
        FrogJumpK_DP4 s=new FrogJumpK_DP4();
        int n=heights.length;
        int a= s.f(heights,n-1,k);
        return a;


    }
    public int f(int [] height,int i,int k)
    {
        if(i==0)
            return 0;
        int j;
        int res=0;
        int op=Integer.MAX_VALUE;
        for(j=1;j<=k;j++)
        {

            if(i>1)
                res=f(height,i-j,k)+Math.abs(height[i]-height[i-j]);
            op=Math.min(op,res);

        }
        return op;
    }
    public static void main(String[] args)
    {
        int[] height1 = {10, 5, 20, 0,15};
        int n = height1.length;
        FrogJumpK_DP4 s1=new FrogJumpK_DP4();

        int ans=s1.frogJump(height1,2);
        System.out.print(ans);


    }
}
