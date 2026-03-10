public class BestTimeToBuySellStock {
    public int maxProfit(int[] a) {


        int n=a.length;
        int buy=a[0];

        int res=0;int maxres=0;

        for(int i=1;i< a.length;i++)
        {
            if(buy>a[i])
                buy=a[i];


            res=a[i]-buy;
            maxres=Math.max(maxres, res);

        }
        //System.out.println(maxres);
        return maxres;


    }
}
