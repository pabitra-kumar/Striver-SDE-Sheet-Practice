import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum(arr , target);
        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ds = new ArrayList<List<Integer>>();
        ArrayList<Integer> ds1 = new ArrayList<>();
        cSum(candidates,0,target,ds,ds1);
        return ds;
    }
    public static void cSum(int[] arr,int i, int t,List<List<Integer>> ds,List<Integer> ds1 )
    {
        if(i>=arr.length)
        {
            if(t==0)
            {
                ds.add(new ArrayList<>(ds1));
            }
            return;
        }
        
        
        if( (t-arr[i]) >= 0 ) 
        {
            t -= arr[i];
            ds1.add(arr[i]);
            cSum(arr,i,t,ds,ds1);
            ds1.remove(ds1.size()-1);
            t += arr[i];
        }
            cSum(arr,i+1,t,ds,ds1);
    }
}
