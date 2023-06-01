import java.util.*;

public class SearchIn2DMat2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>(){{
            add(new ArrayList<Integer>(){{
                add(1); add(2); add(3); add(4);
            }});
            add(new ArrayList<Integer>(){{
                add(5); add(6); add(7); add(8);
            }});
            add(new ArrayList<Integer>(){{
                add(9); add(10); add(11); add(12);
            }});
        }};

        System.out.println(searchMatrix(mat, 10));
        
    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Leetcode or codingNinja
        int n = mat.size() , m = mat.get(0).size();
        int hi = n*m - 1 , lo = 0;

        while(lo<=hi)
        {
            int mid = (lo+hi)/2 ;
            int i = mid/m , j = mid%m ;
            if(mat.get(i).get(j) == target) return true;
            if(mat.get(i).get(j) < target) lo = mid + 1;
            else hi = mid - 1;


        }

        return false;
    }
}
