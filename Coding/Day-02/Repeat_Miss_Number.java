
import java.util.*;

public class Repeat_Miss_Number {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);add(9);add(1);add(7);add(4);
            add(6);add(9);add(3);add(8);add(5);
        }};
        int[] res = missingAndRepeating(arr, arr.size());
        System.out.println(Arrays.toString(res));
        
    }
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // 3 methods
        // 1- by using Map data-structure  or BruteBetter
        // 2- By using algebra methods
        // 3- By using XOR Property
/*  By Using Map method
        int[] a = new int[arr.size()];
        for(int i = 0 ; i<arr.size() ; i++)
        {
            a[arr.get(i)-1]++;
        }
        int r=0,m=0;
        for(int i = 0 ; i<arr.size() ; i++)
        {
            if(a[i]>1)
            r=i+1;
            if(a[i]==0)
            m=i+1;
        }
        int[] k  = {m,r};
        return k ;
        */
        int n1 =0 , n2=0;
        n1 = n*(n+1)/2;
        n2 = n*(n+1)*(2*n+1)/6;
        int s =0 , s2 = 0;
        for(int r : arr)
        {
            s += r;
            s2 += r*r ;
        }
        int mmr = n1 - s ;
        int m2mr2 = n2 - s2;
        int mpr = m2mr2/mmr;
        int m = (mmr + mpr)/2;
        int r =  (mpr - mmr)/2;
        return new int[]{m,r} ;
    }
}
