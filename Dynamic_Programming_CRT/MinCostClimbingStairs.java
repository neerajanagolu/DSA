//Using Recursion

class MinCostClimbingStairs {
    static int fun(int [] cost, int i)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        return cost[i]+ Math.min(fun(cost,i+1), fun(cost,i+2));
    }
    public int minCostClimbingStairs(int[] cost) {

        return  Math.min(fun(cost,0 ),fun(cost,1));

    }
}


//using Dynamic programming
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int s1=cost[0];
        int s2=cost[1];
        for(int i=2;i<cost.length;i++)
        {
            cost[i]+=Math.min(s1,s2);
            s1=s2;
            s2=cost[i];

        }
        return Math.min(s1,s2);

    }
}