package ArraysEx;

import java.util.Arrays;

public class ProductExceptItself {
    public static void main(String [] args)
    {
        int []a={10,3,5,6,2};
        int prod=1;
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            prod=prod*a[i];

        }
        for(int i=0;i<a.length;i++)
        {
            a[i]=prod/a[i];
        }
        System.out.println(Arrays.toString(a));

    }
}
