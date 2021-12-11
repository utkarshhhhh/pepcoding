import java.util.Scanner;
public class reverseArray {
    public static void rev(int[] arr){

        int i=0, j = arr.length-1;
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

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();
        rev(arr);
        print(arr);

        scan.close();
    }
}
