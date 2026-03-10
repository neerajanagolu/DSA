import java.util.*;
public class Majority_Element {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i: nums)
        {
            mp.put(i, mp.getOrDefault(i,0)+1);

        }
        for(int i: nums)
        {
            if(mp.get(i)>(n/2))
                return i;

        }


        return -1;

    }
}
