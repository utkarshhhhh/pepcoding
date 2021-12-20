import java.util.Scanner;

public class rotateArray {
    public static void rev(int[] arr, int i ,int j){
        
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void print(int arr[]) {
        
        for(int i : arr)
        System.out.println(i+" ");
    }

    public static void rotate(int[] arr, int k) {
        
        int n = arr.length;
        k %= n;

        k = k<0 ? k+n :k;

        rev(arr, 0, n-k-1);
        rev(arr, n-k, n-1);

        rev(arr, 0, n-1);
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();
        int k = scan.nextInt();

        rotate(arr, k);
        print(arr);

        scan.close();
    }
}
