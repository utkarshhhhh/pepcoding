import java.util.*;

public class rotateBy90Degree {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
    }

    public static void swap(int[][] arr, int i, int j) {
        
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void transpose(int[][] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                swap(arr, i, j);
            }
        }
    }
    public static void rev1D(int[] arr) {
        
        int i=0 , j=arr.length-1;
        
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

    public static void rev(int[][] arr) {
        for (int[] is : arr) {
            rev1D(is);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        //int m = scan.nextInt();

        int[][] arr =  new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        //print(arr);
        transpose(arr);
        //System.out.println();

        //print(arr);
        rev(arr);
        //System.out.println();

        print(arr);

        scan.close();
    }
}
