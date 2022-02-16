import java.util.*;

public class climbStairsVarJumps {

    public static int climb(int src, int dest, int[] arr) {

        if (src == dest) 
            return 1;
        
        int count = 0;

        for (int i = 1; i <= arr[src] && src + i <= dest; i++) 
            count += climb(src + i, dest, arr);
        
        return count;
    }

    public static int climbM(int src, int dest, int[] arr, int[] dp) {

        if (src == dest) {
            return dp[src] = 1;
        }
        int count = 0;

        if (dp[src] != 0 ) {
            return dp[src];
        }

        for (int i = 1; i <= arr[src] && src + i <= dest; i++) 
            count += climbM(src + i, dest, arr, dp);
        
        return dp[src] = count;
    }


    public static int climbT(int SRC, int dest, int[] arr, int[] dp) {


        for (int src = dest; src >= 0 ; src--) {
            if (src == dest) {
                dp[src] = 1;
                continue;
            }
            int count = 0;
    
            for (int i = 1; i <= arr[src] && src + i <= dest; i++) 
                count +=   dp[src + i]; //climbM(src + i, dest, arr, dp);

            dp[src] = count;
            }        
        
        return dp[SRC];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int[] dp = new int[n + 1];
        System.out.println(climbT(0, n, arr, dp));

        scan.close();
    }

}