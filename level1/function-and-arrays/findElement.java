import java.util.Scanner;

public class findElement {
    
    public static int findEle(int arr[], int d) {
        
        for(int i=0 ; i<arr.length ; i++)
            if( arr[i] == d)
                return i;
        
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();
        int d = scan.nextInt();
        System.out.println( findEle(arr,d) );

        scan.close();
    }
}
