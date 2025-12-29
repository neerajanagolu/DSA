package ArraysEx;

public class Buy_Sell_Stock {

    public static void main(String [] args)
    {
        int []a={7,10,1,3,6,9,2};
        int buy=a[0];
        int maxProfit=0;
        int profit=0;

        for(int i=1;i<a.length;i++)
        {
            buy=Math.min(a[i],buy);

          profit=a[i]-buy;
          maxProfit=Math.max(maxProfit,profit);
        }
        System.out.println(maxProfit);


    }
}
