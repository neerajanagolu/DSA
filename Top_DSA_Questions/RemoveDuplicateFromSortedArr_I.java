public class RemoveDuplicateFromSortedArr_I {
    public int removeDuplicates(int[] nums) {

        if(nums.length==1)
            return 1;

        if(nums[0]!=nums[1] && nums.length==2)
            return 2;

        int i=0;
        int j=i+1;

        while(i<=j && j<nums.length)
        {
            if(nums[i]==nums[j])
                j++;

            else if (nums[i]!=nums[j])
            {
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

        return i+1;

    }
}
