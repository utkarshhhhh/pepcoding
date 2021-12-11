import java.util.Scanner;

public class brokenEconomy {
    public static void bs(int arr[], int d) {
        
        int s=0 , e = arr.length-1, mid;
        int f=-1, c=-1;
        while (s<=e) {
            
            mid = (s+e)/2;
            if(arr[s] == d){
                c=arr[mid]; f=arr[mid];
                break;
            }
            else if( arr[mid] < d){
                f = arr[mid];
                s = mid+1;
            }else{
                c = arr[mid];
                e = mid-1;
            }
        }
        System.out.println( c + "\n" + f);
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();
        int d = scan.nextInt();

        bs(arr, d);
        scan.close();
    }
}
