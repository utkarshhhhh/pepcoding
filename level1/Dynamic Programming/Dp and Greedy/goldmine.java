// import java.util.Arrays;
import java.util.Scanner;

public class goldmine {

    static int[][] dir = { { -1, -1 }, { 0, -1 }, { 1, -1 } };

    
    public static int solveHelper(int[][] arr, int r, int c, int[][] dp) {

        if (r < 0 || c < 0 || r >= arr.length)
            return 0;

        System.out.println(r + " " + c);
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int max = 0;

        for (int i = 0; i < dir.length; i++) {
            int x = r + dir[i][0];
            int y = c + dir[i][1];

            max = Math.max(max, solveHelper(arr, x, y, dp));
        }

        return dp[r][c] = max + arr[r][c];
    }

    public static int solveTab(int[][] arr, int[][] dp) {

        int max = 0, m = arr[0].length , n = arr.length;

        for (int j = m-1; j >= 0; j--) {
            
            for (int i = 0; i < n ; i++) {
                
                if (j == m-1) {
                    dp[i][j] = arr[i][j];
                }else if( i == 0 ){
                    dp[i][j] = Math.max( dp[i][j+1], dp[i+1][j+1])  + arr[i][j];
                }else if( i == n-1 ){
                    dp[i][j] = Math.max( dp[i][j+1], dp[i-1][j+1])  + arr[i][j];
                }else
                    dp[i][j] = Math.max( dp[i+1][j+1] , Math.max( dp[i][j+1], dp[i-1][j+1]) )  + arr[i][j];
            }

        }
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i][0]);
        }

        return max;
    }


    

    public static int solve(int[][] arr) {

        // int max = 0;
        int c = arr[0].length ,  r = arr.length;
        // int[][] dp = new int[r][c];

        // for (int[] a : dp) {
        //     Arrays.fill(a, -1);
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     max = Math.max(max, solveHelper(arr, i, c - 1, dp));
        // }
        // return max;
        return solveTab(arr, new int[r][c]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(solve(arr));
        scan.close();
    }
}
