// https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_3846774?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
import java.util.*;
public class SetMatrixZeroes {
    public static void main(String args[])
    {
        int[][] a = {{1,3,2},{3,4,0}};
        setZeros(a);
        System.out.println(Arrays.toString(a[1]));
    }
    public static void setZeros(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(r[i] == 1 || c[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}