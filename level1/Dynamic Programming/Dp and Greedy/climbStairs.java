import java.util.*;

public class climbStairs {

    // recursion
    public static int climbRec(int n) {

        if (n == 0) {
            return 1;
        }

        int count = 0;
        if (n - 1 >= 0) {
            count += climbRec(n - 1);
        }

        if (n - 2 >= 0) {
            count += climbRec(n - 2);
        }

        if (n - 3 >= 0) {
            count += climbRec(n - 3);
        }
        return count;
    }

    // rec with memo
    public static int climbMemo(int n, int[] dp) {

        if (n == 0) {
            return dp[n] = 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int count = 0;
        if (n - 1 >= 0) {
            count += climbMemo(n - 1, dp);
        }

        if (n - 2 >= 0) {
            count += climbMemo(n - 2, dp);
        }

        if (n - 3 >= 0) {
            count += climbMemo(n - 3, dp);
        }
        return dp[n] = count;
    }

    // dp tabulation
    public static int climbTabu(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {
            int count = 0;

            if (n == 0) {
                dp[n] = 1;
                continue;
            }

            if (n - 1 >= 0)
                count += dp[n - 1];

            if (n - 2 >= 0)
                count += dp[n - 2];

            if (n - 3 >= 0)
                count += dp[n - 3];

            dp[n] = count;
        }
        return dp[N];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] dp = new int[n + 1];
        System.out.println(climbTabu(n, dp));

        scan.close();
    }

}