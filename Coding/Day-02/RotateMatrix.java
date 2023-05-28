import java.util.*;

public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>(){{
            add(new ArrayList<>(){{
                add(1);
                add(2);
                add(3);
            }});
            add(new ArrayList<>(){{
                add(4);
                add(5);
                add(6);
            }});
            add(new ArrayList<>(){{
                add(7);
                add(8);
                add(9);
            }});
        }};

        rotateMatrix(mat , mat.size() , mat.size());
        System.out.println(mat);
        
    }
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int u = 0, l =n-1 , d = 0 , r = m-1 ;
        while(u<l && d<r)
        {
            int prev = mat.get(u+1).get(d);
            for(int i =d ; i<=r ; i++)
            {
                int curr = mat.get(u).get(i);
                mat.get(u).set(i, prev);
                prev = curr;
            }
            u++;
            for(int i =u ; i<=l ; i++)
            {
                int curr = mat.get(i).get(r);
                mat.get(i).set(r, prev);
                prev = curr;
            }
            r--;
            for(int i =r ; i>=d ; i--)
            {
                int curr = mat.get(l).get(i);
                mat.get(l).set(i, prev);
                prev = curr;
            }
            l--;
            for(int i =l ; i>= u ; i--)
            {
                int curr = mat.get(i).get(d);
                mat.get(i).set(d, prev);
                prev = curr;
            }
            d++;
        }
    }
}
