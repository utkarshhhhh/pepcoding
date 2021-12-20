import java.util.*;

public class theStateOfWakanda2 {

    public static void diagonalTraversal(int[][] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0, r = i; j < n && r < n; j++ , r++) 
                System.out.println(arr[j][r]);
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr =  new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        print(arr);
        System.out.println();
        diagonalTraversal(arr);

        scan.close();
    }

}