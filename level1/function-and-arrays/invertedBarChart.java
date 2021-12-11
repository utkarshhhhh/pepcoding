import java.util.Scanner;

public class invertedBarChart {
    public static int max(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++)

            if( arr[i] > max)
                max = arr[i];
    
    return max;
    }

    public static void pattern(int arr[]) {
        
        int max = max(arr);
        for( int height=1 ; height<=max ; height++){
            for(int i=0 ; i<arr.length ; i++){
                if( arr[i] >=  height )
                System.out.print("*\t");
                else
                System.out.print("\t");
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();

        pattern(arr);

        scan.close();
    }
}
