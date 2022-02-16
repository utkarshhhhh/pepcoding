import java.util.Scanner;

public class friendsPairing {

    public static int solve(int n) {

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        return dp[n];
    }

    public static int solvee(int n) {

        int one = 1, two = 2;

        for (int i = 3; i <= n; i++) {
            int ans = two + (i - 1) * one;
            one = two;
            two = ans;
        }
        return n <= 1 ? n : two;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.next().length();

        System.out.println(solve(n));
        scan.close();
    }
}
