import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , s = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        List<int[]> res = pairSum(arr, s);
        for(int[] i : res)
        {
            System.out.println(Arrays.toString(i));
        }
        sc.close();
        // Test Case
        // 35 -7
        // -4 7 -3 4 -8 4 4 0 -6 -7 6 9 3 5 4 -1 -1 -6 -9 0 9 -3 8 5 2 6 2 0 9 -4 -3 0 0 8 4

    }
    public static List<int[]> pairSum(int[] nums, int s) {
        List<int[]> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
            int j = 0;
            int k = n-1;
            while(j<k)
            {
                int sum = nums[j] + nums[k];
                if(sum > s)
                {
                    k--;
                }
                else if(sum < s)
                {
                    j++;
                }
                else
                {
                    int[] res = {nums[j] , nums[k]};
                    ans.add(res);
                    if(nums[j] == nums[k])
                    {
                        int l = k-j;
                        for(int i = 2 ; i <= l ; i++ )
                        {
                            for(int r = 0 ; r < i ; r++)
                            ans.add(res);
                        }
                        break;
                    }
                    j++; k--;
                    int c = 1;
                    while(j<=k && nums[j]==nums[j-1]){
                        ans.add( ans.get(ans.size()-1));
                        c++;
                        j++;
                    } 
                    while(j<=k && nums[k]==nums[k+1]){
                        for(int i = 0 ; i < c  ; i++)
                        ans.add( ans.get(ans.size()-1));
                        k--;
                    }
                }
            }
        return ans;
    }
}
