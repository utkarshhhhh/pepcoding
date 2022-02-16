import java.util.Scanner;

public class partitionIntoSubset {

    public static long solve(int n, int k, long[][] dp) {

        if (n < k || n < 0 || k < 0)
            return 0;
        if (n == k)
            return dp[n][k] = 1;

        if (dp[n][k] != 0)
            return dp[n][k];

        long include = solve(n - 1, k, dp);
        long notInclude = solve(n - 1, k - 1, dp);

        // for every number abcd then multiply by 4
        return dp[n][k] = include*k + notInclude;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(solve(n, k, new long[n + 1][k + 1]));
        scan.close();
    }
}
