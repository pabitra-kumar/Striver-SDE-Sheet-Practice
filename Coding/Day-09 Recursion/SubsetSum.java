import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int a[] = {5 , 2 , 1};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : a) arr.add(i);

        int n = arr.size();
        ArrayList<Integer> ans = subsetSums(arr, n);
        System.out.println(ans);
    }
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        SumOfSubsets(arr,0,N,0,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void SumOfSubsets(ArrayList<Integer> arr,int i, int N, int sum, 
    ArrayList<Integer> ans)
    {
        if(i >= N)
        {
            ans.add(sum);
            return;
        }
        SumOfSubsets(arr , i+1 , N , sum + arr.get(i), ans);
        SumOfSubsets(arr , i+1 , N , sum , ans);
    }
}
