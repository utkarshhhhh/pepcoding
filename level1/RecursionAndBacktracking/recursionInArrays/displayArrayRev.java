import java.util.Scanner;

public class displayArrayRev {

    public static void print(int[] arr , int idx) {
        
        if(idx == arr.length) return;

        print(arr, idx+1);
        System.out.println(arr[idx]);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
            arr[i] = scan.nextInt();

        print(arr, 0);
        scan.close();
    }
}