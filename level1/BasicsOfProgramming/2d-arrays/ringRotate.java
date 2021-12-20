import java.util.*;

public class ringRotate {

    public static int[] twoDto1D(int[][] arr, int r) {

        int minr = r - 1, maxr = arr.length - r;
        int minc = r - 1, maxc = arr[0].length - r;
        int count = 0;

        int[] ans = new int[2 * (maxc - minc + maxr - minr)];

        for (int i = minr; i <= maxr; i++)
            ans[count++] = arr[i][minc];
        minc++;

        for (int i = minc; i <= maxc; i++)
            ans[count++] = arr[maxr][i];
        maxr--;

        for (int i = maxr; i >= minr; i--)
            ans[count++] = arr[i][maxc];
        maxc--;

        for (int i = maxc; i >= minc; i--)
            ans[count++] = arr[minr][i];
        minc++;

        return ans;
    }

    public static void oneDto2D(int[][] arr, int r, int[] oneD) {

        int minr = r - 1, maxr = arr.length - r;
        int minc = r - 1, maxc = arr[0].length - r;
        int count = 0;

        // int[] ans = new int[2 * (maxc - minc + maxr - minr)];

        for (int i = minr; i <= maxr; i++)
            arr[i][minc] = oneD[count++];
        minc++;

        for (int i = minc; i <= maxc; i++)
            arr[maxr][i] = oneD[count++];
        maxr--;

        for (int i = maxr; i >= minr; i--)
            arr[i][maxc] = oneD[count++];
        maxc--;

        for (int i = maxc; i >= minc; i--)
            arr[minr][i] = oneD[count++];
        minc++;

    }

    public static void rev(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }

    }

    public static void rotate1D(int[] arr, int k) {

        int l = arr.length;
        k %= l;
        k = k < 0 ? k + l : k;

        rev(arr, 0, l - k - 1);
        rev(arr, l - k, l - 1);
        rev(arr, 0, l - 1);

    }

    public static void rotate2D(int[][] arr, int r, int k) {

        int[] ans = twoDto1D(arr, r);
        rotate1D(ans, k);
        oneDto2D(arr, r, ans);

    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
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

        int r = scan.nextInt();
        int k = scan.nextInt();

        // print(arr);
        rotate2D(arr, r, k);
        // System.out.println();

        print(arr);

        scan.close();
    }

}
