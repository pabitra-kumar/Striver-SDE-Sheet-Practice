public class MajorityElement1 {
    public static void main(String[] args) {
        int[] arr = {2,3,9,2,2};
        System.out.println(findMajority(arr, arr.length));
    }
    public static int findMajority(int[] nums, int n) {
        // Coding-Ninja Solution and also work for leetcode but for leetcode 2nd loop is not required.
		int el = nums[0], count=0;
        for(int i: nums)
        {
            if(count == 0) el = i ;
            count += (i==el)?1:-1;
        }
		count = 0;
		for(int i : nums)
		{
			if(i==el) count++;
		}
        return count>n/2 ? el : -1;
	}
}
