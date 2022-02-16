import java.util.Scanner;

public class minCostMazeTravel {

    public static int solve(int[][] arr) {
        
        int n = arr.length , m = arr[0].length;
        
        int[][] dp = new int[n][m];
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = m-1; j >= 0; j--) {
                
                if (i==n-1 && j== m-1) {
                    dp[i][j] = arr[i][j]; 
                } else if ( i==n-1 ) {
                    dp[i][j] = arr[i][j] + dp[i][j+1];
                } else if ( j==m-1 ) {
                    dp[i][j] = arr[i][j] + dp[i+1][j];  
                }else
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) +  arr[i][j];

            }
        }
        return dp[0][0];
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
