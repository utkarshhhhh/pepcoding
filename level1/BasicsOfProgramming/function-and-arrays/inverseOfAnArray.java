import java.util.Scanner;

public class inverseOfAnArray {
    
    public static int[] inverse(int[] a){
        // write your code here
        int[] ans = new int[a.length];

        for(int i=0 ; i<a.length ; i++){
            ans[a[i]] = i;
        }
        return ans;
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

        inverse(arr);
        print(arr);

        scan.close();
    }
}
