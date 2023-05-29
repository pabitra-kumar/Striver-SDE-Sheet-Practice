
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
    }
}
