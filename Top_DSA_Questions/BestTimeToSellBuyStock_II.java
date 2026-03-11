public class BestTimeToSellBuyStock_II {
    public int maxProfit(int[] a) {

        int buy=a[0];
        int res=0;
        for(int i=0;i<a.length-1;i++)
        {

            if(a[i]<a[i+1])
            {
                res+=a[i+1]-a[i];
            }


        }
        return res;

    }
}
