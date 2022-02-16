import java.util.Scanner;

public class zero1knapsack {

    public static int solve(int[] val, int[] wt, int tar) {
        
        int n = val.length;
        int[][] dp = new int[n+1][tar+1];

        for (int i = 1; i <= n; i++) {          // wt array
            for (int j = 0; j <= tar; j++) {    //  target weight
                
                int yesCall = 0;
                int noCall = dp[i-1][j];

                if (j - wt[i-1] >= 0) 
                    yesCall = val[i-1] + dp[i-1][j - wt[i-1] ];
            
                dp[i][j] = Math.max(noCall, yesCall);
            }
        }

        return dp[n][tar];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] values = new int[n];
        int[] wt = new int[n];

        for (int i = 0; i < n; i++) 
        values[i] = scan.nextInt();
        
        for (int i = 0; i < n; i++) 
        wt[i] = scan.nextInt();
        
        int tar = scan.nextInt();
        System.out.println( solve(values,wt,tar) );

        scan.close();
    }
}
