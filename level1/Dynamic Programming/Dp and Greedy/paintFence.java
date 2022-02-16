import java.util.Scanner;

public class paintFence {

    public static long solve(int n, int k) {
        
        long[][] dp = new long[n+1][2];


        for (int i = 2; i <= n; i++) {
            
            if (i==2) {
                dp[i][0] = k;
                dp[i][1] = k*(k-1);
                continue;
            }

            long xx = dp[i-1][0];
            long xy = dp[i-1][1];

            long xyy = xy;
            long xyz = (xx+xy)*(k-1);

            dp[i][0] = xyy;
            dp[i][1] = xyz;
}

        return dp[n][0] + dp[n][1];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println( solve(n,k) );
        scan.close();
    }
}
