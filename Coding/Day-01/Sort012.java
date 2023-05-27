import java.util.*;
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0 , 1 , 2 , 1, 1, 1, 0 ,0 , 0 ,2 ,0 , 2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int[] nums)
    {
        int low = 0 , mid = 0 , high = nums.length -1 ;
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums , mid , low);
                low++; mid++;
            }
            else if(nums[mid] == 1)
            mid++;
            else
            {
                swap(nums , mid , high);
                high--;
            }
        }
    }
    public static void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
