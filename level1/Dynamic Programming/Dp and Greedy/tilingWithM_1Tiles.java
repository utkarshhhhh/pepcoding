import java.util.Scanner;

public class tilingWithM_1Tiles {

    public static int solve(int n,int m,int[] dp) {
        
       
        for (int i = 1; i <= n; i++) {
            if(i<m){
                dp[i] = 1;
            }else if(i==m){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-1] + dp[i-m];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println( solve(n,m,new int[n+1]) );
        scan.close();
    }
}
