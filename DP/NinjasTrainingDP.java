package DP;

class NinjasTrainingDP {
    public int maximumPoints(int m[][]) {
        // code here
        int n=m.length;
        int dp[]=new int[4];
        dp[0]=Math.max(m[0][1],m[0][2]);
        dp[1]=Math.max(m[0][0],m[0][2]);
        dp[2]=Math.max(m[0][1],m[0][0]);
        dp[3]=Math.max(m[0][0],Math.max(m[0][1],m[0][2]));

        for(int day=1;day<n;day++)
        {
            int temp[]=new int[4];
            // Arrays.fill(temp,0);
            for(int last=0;last<4;last++)
            {
                temp[last]=0;
                for(int task=0;task<3;task++)
                {
                    if(task!=last)
                    {
                        temp[last]=Math.max(temp[last],m[day][task]+dp[task]);
                    }
                }
            }
            dp=temp;
        }
        return dp[3];





    }
}
