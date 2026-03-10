public class Rotate_Arr {
    public void rotate(int[] nums, int k) {

        int n=nums.length;

        k=k%n;

        int temp[]=new int[n-k];
        for(int i=0;i<n-k;i++)
        {
            temp[i]=nums[i];

        }
        for(int i=0;i<k ;i++)
        {
            nums[i]=nums[(n-k)+i];

        }
        int j=0;
        for(int i=k;i<n;i++)
        {
            nums[i]=temp[j];
            j++;

        }


    }
}

