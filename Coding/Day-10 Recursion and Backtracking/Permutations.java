import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int nums[] = {1 , 2 , 3};
        Permutations ob = new Permutations();
        List<List<Integer>> ans = ob.permute(nums);
        System.out.println(ans);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums , 0 , new ArrayList<>() , ans);
        return ans;
    }
    static void helper(int[] nums, int ind, List<Integer> ds , List<List<Integer>> ans)
    {
        if(ind >= nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind ; i < nums.length ; i++)
        {
            swap(nums , i , ind);
            ds.add(nums[ind]);
            helper(nums , ind+1 , ds , ans);
            ds.remove(ds.size() - 1);
            swap(nums , i , ind);
        }
    }
    static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
