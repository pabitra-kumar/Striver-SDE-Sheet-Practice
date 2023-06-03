import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
        
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        for(int i : set)
        {
            if(set.contains(i-1)) continue;
            else
            {
                int count = 1;
                while(set.contains(i+count)) count++;
                longest = Math.max(longest , count);
            }
        }
        return longest;

        // Another Approach is sorting
    }
}
