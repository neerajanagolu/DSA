import java.util.*;
public class LongestSubarraySumK {
    static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int []a=new int [n];
        System.out.println("enter elements of array");

        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();

        System.out.println(Arrays.toString(a));
        System.out.println("enter k value ");
        int k =4;

        System.out.println(longestSubarray(a, k));
    }



}
