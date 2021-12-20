import java.util.*;

public class saddlePrice {

   public static int min(int[] arr) {
       
    int ans = Integer.MAX_VALUE, idx = -1;
    for (int i = 0; i < arr.length; i++) 
        if(arr[i] < ans){
            ans = arr[i];
            idx = i;
        }
        return idx;
    }

    public static int max(int[][] arr, int col) {
       
        int ans = Integer.MIN_VALUE , idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col] > ans){
                ans = arr[i][col];
                idx = i;
            }
        }
    return idx;
   }

   public static void saddle(int[][] arr) {
       
    for (int i = 0; i < arr.length; i++) {
        
        int min = min(arr[i]);
        if( max(arr, min) == i){
            System.out.println( arr[i][min]);
            return;
        }
    }
    System.out.println("Invalid Input");
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        //int m = scan.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        saddle(arr);

        scan.close();
    }

}
