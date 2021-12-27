import java.util.Scanner;

public class maxOfAnArray {

    public static int max(int[] arr , int idx) {
        
        if(idx == arr.length-1) return arr[idx];
        return Math.max(arr[idx], max(arr, idx+1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
            arr[i] = scan.nextInt();
        
        System.out.println(max(arr, 0));
        scan.close();
    }
}