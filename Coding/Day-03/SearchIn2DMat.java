

public class SearchIn2DMat {
    public static void main(String[] args) {
        // row-wise and Column wise Sorted (GFG)
        int[][] mat = {
            { 3, 30, 38},
            {36, 43, 60},
            {40, 51, 69}
        };
        System.out.println(search(mat, mat.length, mat[0].length, 40));
        System.out.println(search(mat, mat.length, mat[0].length, 33));
        
    }
    static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int i = 0 , j = m-1 ;
        while(i<n && j>=0)
        {
            if(matrix[i][j] == x)
            return true;

            if(x<matrix[i][j]) j--;
            else i++;

        }
        return false;
	} 
}
