public class RemoveDuplicatesFromSortedArr_II {
    public int removeDuplicates(int[] nums) {

        int k=0;
        int i=2;

        if(nums.length==1)
            return 1;

        if(nums.length==2)
            return 2;

        // if(nums[0]==nums[1] && nums[1]==nums[2])
        // return 2;



        while(i<nums.length)
        {
            if(nums[i-2]!=nums[i])
            {
                nums[k]=nums[i-2];
                k++;
                i++;


            }
            else
            {
                i++;
            }
        }
        nums[k]=nums[nums.length-2];
        k++;
        nums[k]=nums[nums.length-1];
        //  k++;


        return k+1;


    }
}
