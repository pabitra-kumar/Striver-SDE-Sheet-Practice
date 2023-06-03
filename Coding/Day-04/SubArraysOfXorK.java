import java.util.*;

public class SubArraysOfXorK {
    public static void main(String[] args) {
        int[] arr = {2,2 , 4, 2, 2, 6, 4};

        System.out.println(solve(arr, 6));
        
    }
    public static int solve(int[] arr, int B) {
        int n = arr.length;
        if(n == 0) return 0 ;
        int xr = 0;
        int count = 0;
        HashMap<Integer , Integer> m = new HashMap<>();
        m.put(xr,1);
        for(int i = 0 ; i < n ; i++)
        {
            xr = xr ^ arr[i];
            int j = xr ^ B ;

            if(m.containsKey(j))   
            count += m.get(j);

            if(!m.containsKey(xr))  
            m.put(xr , 1);
            else  
            m.put(xr , m.get(xr) + 1);
        }
        return count;
    }
}
