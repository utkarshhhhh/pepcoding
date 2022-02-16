import java.util.Scanner;

public class coinChangeCombination {

    public static int solve(int[] arr , int tar) {
        
        int[] dp = new int[tar+1];

        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                
                if( j-arr[i] >= 0 ){
                    dp[j] += dp[j-arr[i]] ; 
                }

            }
        }

        // for (int i : dp) {
        //     System.out.print(i +" ");
        // }
        System.out.println();

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
        System.out.println();
        System.out.println(solve(arr,tar));

        scan.close();
    }
}
