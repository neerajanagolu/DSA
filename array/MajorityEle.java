import java.util.Arrays;
import java.util.Scanner;

public class MajorityEle {
    public static int majority(int [] a)
    {
        int candidate = 0;
        int count = 0;

        for (int num :a) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : a) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > a.length / 2) {
            return candidate;
        }
        return -1;
    }


    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int []a=new int [n];
        System.out.println("enter elements of array");

        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();

        System.out.println(Arrays.toString(a));
        System.out.println(majority(a));

      

    }

}
