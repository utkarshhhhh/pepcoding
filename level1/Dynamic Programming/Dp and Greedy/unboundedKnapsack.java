import java.util.Scanner;

public class unboundedKnapsack {

    public static int solve(int[] val, int[] wt, int tar) {
        
        int n = val.length;
        int[] dp = new int[tar+1];

        for (int i = 1; i <= tar; i++) {  // target weight
            for (int j = 0; j < n; j++) {   // curr weights
                
                int noCall = dp[i-1];
                int yesCall = 0;

                if( i-wt[j] >= 0 ){
                    yesCall = dp[i-wt[j]] + val[j];
                }
                dp[i] =  Math.max(dp[i], Math.max(noCall, yesCall) );
            }
            
        }

        return dp[tar];
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