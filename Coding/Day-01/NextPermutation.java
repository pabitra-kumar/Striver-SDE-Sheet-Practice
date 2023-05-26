import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {3,2,1};
        nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }
    public static void nextPermutation(int[] nums) {
        int bg =0 , sm=0 ;
        for(int i =nums.length-2 ; i>=0 ; i--)
        {
            if(nums[i]<nums[i+1])
            {
                bg = i+1 ;
                sm = i;
                break;
            }
        }
        for(int i =nums.length-1 ; i>=bg ; i--)
        {
            if(nums[i]>nums[sm])
            {
                swap(nums , i , sm);
                break;
            }
        }
        reverse(nums , bg);
    }

    public static void swap (int[] nums , int i , int j )
    {
        if(i==j) return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    public static void reverse(int[] nums , int j)
    {
        for(int i =j ; i<=(((nums.length-1-j)/2)+j) ; i++)
        {
            swap(nums , i , nums.length-1-(i-j));
        }
    }
}
