import java.util.Scanner;

public class climbMinMoves {

    public static Integer climb(int[] arr) {

        
        Integer[] dp = new Integer[arr.length+1];
        int n = dp.length;
        for (int i = n-1 ; i >=0 ; i--) {
            

            if (i==n-1) {
                dp[i] = 0;
                continue;
            }

            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= arr[i] && i+j < n; j++) {
                
                if( dp[i+j] != null ){
                    min = Math.min(min, dp[i+j]);
                }
            }
            
            if (min != Integer.MAX_VALUE) 
                dp[i] = min +1;
        }

        return dp[0];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        
        System.out.println( climb(arr) );

        scan.close();
    }
}
