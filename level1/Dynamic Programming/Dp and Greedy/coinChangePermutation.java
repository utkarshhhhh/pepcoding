import java.util.Scanner;

public class coinChangePermutation {

    public static int solve(int[] arr , int tar) {
        
        int[] dp = new int[tar+1];

        dp[0] = 1;
        for (int j = 0; j < dp.length; j++) {   // remember reverse and reason
            for (int i = 0; i < arr.length; i++) {
                
                if( j-arr[i] >= 0 ){
                    dp[j] += dp[j-arr[i]] ; 
                }

            }
        }

        for (int i : dp) {
            System.out.print(i +" ");
        }


        return dp[tar];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int tar = scan.nextInt();

        System.out.println(solve(arr,tar));

        scan.close();
    }
}
