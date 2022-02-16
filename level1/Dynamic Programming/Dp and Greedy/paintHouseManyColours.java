import java.util.Scanner;

public class paintHouseManyColours {

    public static long min(long... arr) {
        long min = (long)1e16;
        for (long l : arr) {
            min = Math.min(min, l);
        }
        return min;
    }

    public static long min(long[] arr, int idx) {
        long min = (long)1e16;
        for (int i=0 ; i<arr.length ; i++) {
            if(i!=idx)
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static long solve(long[][] arr) {

        int n = arr.length, m = arr[0].length;

        long[][] dp = new long[n][m];

        for (int i = 0; i < m; i++) {
            dp[0][i] = arr[0][i];
        }

        for (int i = 1; i < n; i++) {
            for(int j=0 ; j<m ; j++){
                dp[i][j] = arr[i][j] + min(dp[i-1], j)  ;
            }
        }
        return min(dp[n-1], -1)  ;
    }

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        long[][] arr = new long[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(solve(arr));
        scan.close();
    }
}
