public class KadenAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3 , -5 , 4 , 8 , -2, 1};
        int n = arr.length;
        long res = maxSubarraySum(arr , n);
        System.out.println(res);
    }
    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum = arr[0] , sum =0 ;
		for(int i =0 ; i<n ; i++)
        {
            sum += arr[i];
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}