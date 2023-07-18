import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(arr , target);
        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        cSum2(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
    public static void cSum2(int[] arr, int i, int t, ArrayList<List<Integer>> ans, ArrayList<Integer> ds)
    {
        if(t==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int j =i;j<arr.length;j++)
        {
            if(j>i && arr[j]==arr[j-1]) continue;
            if(arr[j]>t) break;
            ds.add(arr[j]);
            cSum2(arr,j+1,t-arr[j],ans,ds);
            ds.remove(ds.size()-1);
        }
        
    }
}
