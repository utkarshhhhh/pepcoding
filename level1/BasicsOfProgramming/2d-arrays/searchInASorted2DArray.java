import java.util.*;

public class searchInASorted2DArray {

    public static void search2D(int[][] arr, int d) {

        int c = arr[0].length;
        int i = 0, j = c - 1;

        while (j >= 0 && i < c) {

            if (arr[i][j] == d) {
                break;
            } else if (arr[i][j] > d) {
                j--;
            } else
                i++;

        }

        if (j < 0 || i >= c)
            System.out.println("Not Found");
        else
            System.out.println(i + "\n" + j);
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

        int d = scan.nextInt();
        search2D(arr, d);

        scan.close();
    }

}
