import java.util.Scanner;

public class spanOfArray {

    public static int span(int[] arr){

        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length ; i++){

            if( arr[i] > max){
                max = arr[i];
            }else if( arr[i] < min){
                min = arr[i];
            }
        }

        return max-min;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();

        System.out.println(span(arr));

        scan.close();
    }
}
