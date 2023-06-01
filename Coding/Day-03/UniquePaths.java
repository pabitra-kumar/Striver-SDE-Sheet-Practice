public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    // public static int uniquePaths(int m, int n) {
    //     int[][] dp = new int[m][n];
    //     for(int i = 0 ; i < m ;i++)
    //     {
    //         for(int j = 0 ; j < n ; j++)
    //         {
    //             dp[i][j] = -1;
    //         }
    //     }
    //     return paths(0 , 0 , m , n , dp);
    // }
    // public static int paths(int i , int j , int m , int n , int[][] dp)
    // {
    //     if(i >= m || j >= n) return 0;
    //     if(i== m-1 && j== n-1) return 1;

    //     if(dp[i][j] != -1) return dp[i][j];
    //     else return dp[i][j] = paths(i+1 , j , m ,n,dp ) + paths(i , j+1 , m , n , dp) ;
        
    // }
    public static int uniquePaths(int m, int n) {
        double res = 1;
        int N = Math.min(m-1 , n-1);
        int h = m+n-2;
        
        for(int i = 1 ; i<= N ; i++)
        res = res * (h-i+1) / i ;

        return (int)res;
    }
}
