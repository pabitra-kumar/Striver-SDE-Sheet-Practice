import java.util.*;

public class LongestSubArraySumK {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(new Integer[] {1,-1,2,-2});
        System.out.println(LongestSubsetWithZeroSum(new ArrayList<>(arr)));

        int[] arr2 = {15 , -2 , 2 , -8 , 1 , 7 , 10 , 23} ;
        System.out.println(maxLen(arr2, arr2.length));

        int[] arr3 = {2 , 3 , 1 , 1 , 1 , 1 , 2 , 1 , 2 , 3 };
        System.out.println(LongestSubsetWithSumK(arr3, 6));
        
    }
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        if(arr.size() == 0) return 0 ;
        int longest = 0 , sum = 0;
        HashMap<Integer , Integer> m = new HashMap<>();
        for(int i = 0 ; i < arr.size() ; i++)
        {
            sum += arr.get(i);
            
            if(sum==0) longest = i+1;
            if(m.containsKey(sum))
            {
                longest = Math.max(longest , i - m.get(sum));
            } 
            else
            {
                m.put(sum , i);
            }
        }
        return longest;
	}
    public static int maxLen(int arr[], int n)
    {
        if(n == 0) return 0 ;
        int longest = 0 , sum = 0;
        HashMap<Integer , Integer> m = new HashMap<>();
        for(int i = 0 ; i < n ; i++)
        {
            sum += arr[i];
            
            if(sum==0) longest = i+1;
            if(m.containsKey(sum))
            {
                longest = Math.max(longest , i - m.get(sum));
            } 
            else
            {
                m.put(sum , i);
            }
        }
        return longest;
    }
    public static int LongestSubsetWithSumK(int[] arr , int k) {
        // All integers in the array must be positive
        int n = arr.length;
        if(n == 0) return 0;
        int i = 0 , j = 0;
        int count = arr[0] , longest = 0;
        while(i < n && j < n)
        {
            if(count<k)
            {
                j++;
                if(j<n)
                count += arr[j];
            }
            else if(count > k)
            {
                count -= arr[i];
                i++;
            }
            else
            {
                longest = Math.max(longest , j-i+1);
                j++;
                if(j<n)
                count += arr[j];
            }
        }
        return longest;
    }

}
