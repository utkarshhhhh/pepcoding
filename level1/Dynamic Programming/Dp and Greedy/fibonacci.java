import java.util.*;

public class fibonacci {

    // recursion
    public static int fibRec(int n) {

        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    // rec with memo
    public static int fibRecMemo(int n, int[] dp) {

        if (n <= 1) {
            return dp[n] = n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int x = fibRecMemo(n - 1, dp);
        int y = fibRecMemo(n - 2, dp);
        return dp[n] = x + y;
    }

    // dp tabulation
    public static int fibRecTabu(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {
            if (n <= 1)
                dp[n] = n;
            else
                dp[n] = dp[n - 1] + dp[n - 2];

        }
        return dp[N];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] dp = new int[n + 1];
        System.out.println(fibRecMemo(n, dp));

        scan.close();
    }

}