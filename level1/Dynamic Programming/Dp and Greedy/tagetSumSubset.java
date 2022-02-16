import java.util.Scanner;

public class tagetSumSubset {

    public static boolean solve(int[] arr, int tar) {
        
        boolean[][] dp = new boolean[arr.length+1][tar+1];
        int n = dp.length, m = dp[0].length;

        for (int i = 0; i < n; i++) { // arr elements
            for (int j = 0; j < m; j++) { // sum
                
                if (j==0) {
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = false;
                }else {
                    boolean noCall = dp[i-1][j];
                    boolean yesCall = false;

                    if( j - arr[i-1] >= 0  ){
                        yesCall = dp[i-1][ j-arr[i-1] ];
                    }
                    dp[i][j] = noCall || yesCall;
                }
            }

        }
        return dp[n-1][m-1];

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int tar = scan.nextInt();
        System.out.println(solve(arr, tar));
        scan.close();
    }
}
