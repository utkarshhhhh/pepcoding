import java.util.*;

public class spiralDisplay {
    public static void spiral(int[][] arr) {

        int r = arr.length , c = arr[0].length;
        int minr = 0, minc = 0;
        int maxr = r - 1, maxc = c - 1;
        int count = 0, total = r*c;
        while( count < total ){

            for (int i = minr; i <= maxr && count < total ; i++) {
                System.out.println(arr[i][minc]);
                count++;
            } minc++;

            for (int i = minc; i <= maxc && count < total ; i++) {
                System.out.println(arr[maxr][i]);
                count++;
            } maxr--;

            for (int i = maxr; i >= minr && count < total ; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            } maxc--;

            for (int i = maxc; i >= minc && count < total ; i--) {
                System.out.println(arr[minr][i]);
                count++;
            } minr++;
        }
        
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        spiral(arr);

        scan.close();
    }
}
