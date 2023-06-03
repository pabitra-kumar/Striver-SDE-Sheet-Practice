import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15}; // Input
        System.out.println(Arrays.toString(twoSum(arr, 9))); // Target input
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> m = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            int p = target - nums[i] ;
            if(m.containsKey(p))
            {
                return new int[]{m.get(p) , i};
            }
            
            if(m.containsKey(nums[i])) m.put(nums[i] , i);
            else m.put(nums[i] , i);
            
        }
        return new int[]{0,0};
    }
}