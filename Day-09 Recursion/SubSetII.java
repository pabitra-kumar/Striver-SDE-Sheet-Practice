import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetII {
    public static void main(String[] args) {
        int nums[] = {4,4,4,1,4};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums , 0 , nums.length, new ArrayList<>() , ans);
        return ans;
    }
    static void subsets(int[] nums, int ind , int N , List<Integer> ds, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds)); 
        for(int i = ind ; i<nums.length ; i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            subsets(nums , i+1 , N, ds, ans); 
            ds.remove(ds.size() - 1);
        }
    }
}
