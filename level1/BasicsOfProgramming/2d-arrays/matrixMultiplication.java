import java.util.*;

public class matrixMultiplication {
    private static Scanner scan = new Scanner(System.in);

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }

    public static int[][] matrixMulti(int[][] arr1, int[][] arr2) {

        int[][] ans = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for(int k=0 ; k<arr1[0].length ; k++)
                    sum += arr1[i][k]*arr2[k][j];
                ans[i][j] = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int n1 = scan.nextInt();
        int m1 = scan.nextInt();

        int[][] arr1 = new int[n1][m1];
        input(arr1);
        ;

        int n2 = scan.nextInt();
        int m2 = scan.nextInt();

        int[][] arr2 = new int[n2][m2];
        input(arr2);

        if (m1 != n2)
            System.out.println("Invalid input");
        else {
            int[][] c = new int[n1][m1];
            c = matrixMulti(arr1,arr2);
            print(c);
        }
        scan.close();
    }

}