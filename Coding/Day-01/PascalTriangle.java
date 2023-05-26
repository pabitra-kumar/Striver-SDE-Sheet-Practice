import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Long>> a = printPascal(5);
        System.out.println(a);
    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> a = new ArrayList<>();
        for(int i =1 ; i<=n ;i++)
        {
            ArrayList<Long> ds = new ArrayList<>();
            for(int j=1 ; j<= i ; j++)
            {
                if(j==1 || j == i) ds.add(1L);
                else ds.add(a.get(i-2).get(j-2) + a.get(i-2).get(j-1));
            }
            a.add(ds);
        }
        return a;
    }
}
