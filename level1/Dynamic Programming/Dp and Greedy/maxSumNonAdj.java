import java.util.Scanner;

public class maxSumNonAdj {
    
    public static int solve(int[] arr, int[] dp) {
     
        int n = arr.length;
        dp[1] = arr[0];
        for (int i = 2; i <= n; i++) {
            
            int noCall = Math.max(dp[i-2], dp[i-1]);
            int yesCall = dp[i-2] + arr[i-1];

            dp[i] = Math.max(noCall, yesCall);
        }

        return dp[n];
    }


    public static int solve(int[] arr) {
     
        int n = arr.length;
        
        int noCall = 0, yesCall = 0;

        for (int i = 0; i < n; i++) {
            
            int noCallT = Math.max(noCall, yesCall);
            int yesCallT = noCall + arr[i];

            noCall = noCallT;
            yesCall = yesCallT;

        }

        return Math.max(noCall, yesCall);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(solve(arr,new int[n+1]));
        scan.close();
    }

}
