import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        NQueens ob = new NQueens();
        List<List<String>> ans1 = ob.solveNQueens(n);
        System.out.println("Answer of first Approach is: \n" + ans1 );
        List<List<String>> ans2 = solveNQueens2(n);
        System.out.println("\n Answer of Second Approach is: \n" + ans2 );
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        String demo = "";
        for(int i = 0 ; i < n ; i++)
        {
            demo += '.';
        }
        helper(n , 0 , new ArrayList<>() , ans , demo);
        return ans;
    }
    static void helper(int n , int ind, List<String> ds , List<List<String>> ans , String demo)
    {
        if(ind >= n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0 ; i < n ; i++ )
        {
            if(isPossible(ds , i))
            {
                // System.out.println(printQ(i , n));
                ds.add(printQ(i , demo));
                helper(n , ind+1 , ds , ans , demo);
                ds.remove(ds.size() - 1);
            }
        }

    }
    static boolean isPossible(List<String> ds , int i)
    {
        int j = ds.size();
        int l = 1;
        for(int k = j-1 ; k >= 0 ; k--)
        {
            if(ds.get(k).charAt(i) == 'Q')
            return false;

            if(i >= l && ds.get(k).charAt(i-l) == 'Q')
            return false;

            if(i+l < ds.get(0).length() && ds.get(k).charAt(i+l) == 'Q')
            return false;
            l++;
        }
        return true;
    }
    static String printQ(int ind , String demo)
    {
       String a = demo.substring(0 , ind);
       String b = demo.substring(ind , demo.length());
       b = b.replaceFirst("." , "Q");
       return (a+b);
    }

    // 2nd Approach
    public static List < List < String >> solveNQueens2(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];
        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
        return res;
    }



    static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }


    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
