import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArraySumm {

        public static void main(String[] args) {
           // int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            Scanner sc=new Scanner(System.in);
            System.out.println("enter size");
            int n=sc.nextInt();
            int []a=new int [n];
            System.out.println("enter elements of array");

            for(int i=0;i<a.length;i++)
                a[i]=sc.nextInt();

            System.out.println(Arrays.toString(a));

            System.out.println(maxSubArray(a));
        }

        static int maxSubArray(int[] arr) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int i;
            int n = arr.length;
            for (i = 0; i < n; i++) {
                sum = sum + arr[i];
                if (sum > max) {
                    max = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }
                return max;
            }
            return -1;
        }
}
//5,4,-1,7,8

