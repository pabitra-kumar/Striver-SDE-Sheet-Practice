import java.util.ArrayList;

public class PermutationSequence {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        String ans = getPermutation(n , k);
        System.out.println(ans);
    }
    public static String getPermutation(int n, int k) {
        String res = "";
        ArrayList<Integer> arr = new ArrayList<>();
        int fact = 1;
        for(int i = 1 ; i <= n ; i++)
        {
            fact *= i;
            arr.add(i);
        }
        for(int i = n ; i>1 ; i--)
        {
            fact /= i;
            int j = (int)Math.ceil(k*1.0 / fact);
            k -= fact * (j-1);
            res = res + arr.get(j-1);
            arr.remove(j-1);
        }
        res = res + arr.get(0);
        return res;
    }
}
