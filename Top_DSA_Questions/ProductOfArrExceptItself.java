public class ProductOfArrExceptItself {
    public int[] productExceptSelf(int[] a) {
        int left=1;
        int right=1;
        int n=a.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {

            res[i]=1;

        }
        for(int i=0;i<n;i++)
        {
            res[i]*=left;
            left=left*a[i];

        }
        for(int i=n-1;i>=0;i--)
        {
            res[i]*=right;
            right=right*a[i];
        }
        return res;


    }
}
