import java.util.Scanner;

public class paintHouse {

    public static long min(long... arr) {
        long min = (long)1e16;
        for (long l : arr) {
            min = Math.min(min, l);
        }
        return min;
    }

    public static long solve(long[][] arr) {

        int n = arr.length, m = arr[0].length;

        long[][] dp = new long[n][m];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + min(dp[i-1][1] , dp[i-1][2])  ;
            dp[i][1] = arr[i][1] + min(dp[i-1][0] , dp[i-1][2])  ;
            dp[i][2] = arr[i][2] + min(dp[i-1][0] , dp[i-1][1])  ;
        }
        return min(dp[n-1][0] , dp[n-1][1] , dp[n-1][2])  ;
    }

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long[][] arr = new long[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(solve(arr));
        scan.close();
    }
}
