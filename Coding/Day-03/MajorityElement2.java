import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(7); add(4); add(4); add(9); add(7);
        }};
        System.out.println(majorityElementII(arr));
    }
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> nums) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int el1 = 0 , el2 = 0;
        int count1 = 0 , count2 = 0 ;
        for(int i : nums)
        {
            if(count1==0 && i!=el2)
            {
                count1 = 1;
                el1 = i;
            }
            else if(count2==0 && i!=el1)
            {
                count2 = 1;
                el2 = i;
            }
            else if(i == el1) count1++;
            else if(i == el2) count2++;
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i : nums)
        {
            if(i == el1) count1++;
            if(i == el2) count2++;
        }
        int n = nums.size();
        if(count1 > n/3) ans.add(el1);
        if(count2 > n/3) ans.add(el2);

        return ans;
    }
}
