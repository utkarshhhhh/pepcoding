import java.util.Scanner;

public class subarrayProblem {
    
    public static void subArray(int[] a){
        // write your code here

        for(int start=0 ; start<a.length ; start++){
            for(int end = start ; end<a.length ; end++){
                for (int s = start; s <= end; s++) {
                    System.out.print(a[s]+"\t");
                }System.out.println();
            }
        }
      }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++)
        arr[i] = scan.nextInt();

        subArray(arr);
        
        scan.close();
    }
}
