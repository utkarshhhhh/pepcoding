import java.util.Scanner;

public class tilingWith2_1Tiles {

    public static int solve(int n,int[] dp) {
        
        if (n<=2) {
            return dp[n] = n;
        }

        if(dp[n] != 0) return dp[n];
        return dp[n] = solve(n-1, dp) + solve(n-2, dp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println( solve(n,new int[n+1]) );
        scan.close();
    }
}
