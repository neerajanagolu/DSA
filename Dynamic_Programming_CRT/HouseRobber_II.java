public class HouseRobber_II {
    static int fun1(int arr[],int s, int e)
    {
        int prev2 = 0;
        int prev1 = 0;

        for(int i = s; i <= e; i++) {
            int curr = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    public int rob(int[] a)
    {
        int n=a.length;

        if(a.length==1)
            return a[0];

        if(a.length==2)
            return Math.max(a[0],a[1]);



        int first=fun1(a,0,n-2);
        int last=fun1(a,1,n-1);
        return Math.max(first, last);

    }
}
