import java.util.*;

public class theStateOfWakanda1 {

    public static void print1(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {

            if(i%2 == 0)
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j][i]+"\t");
            }else
            for (int j = arr.length-1; j>=0 ;j--) {
                System.out.println(arr[j][i]+"\t");
            }
        }
    }

    public static void print2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr =  new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        print2(arr);
        System.out.println();
        print1(arr);

        scan.close();
    }

}