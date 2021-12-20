import java.util.Scanner;

public class cfB {

    public static void solve(String[] arr , int n) {
        
        StringBuilder str = new StringBuilder(arr[0]);

        for (int i=1 ; i<n-2 ; i++) {
            char a = str.charAt(str.length()-1) , b = arr[i].charAt(0);
            //System.out.println(a+" "+b);
            if( a == b)
                str.append(arr[i].charAt(1));
            else
                str.append(arr[i]);
            // System.out.println(a==b);
            // System.out.println(str);
        }
        if (str.length() != n) {
            //System.out.println("here");
            str.append("a");
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        //int[] arr = new int[7];
        while (t-->0) {
            
            int n = scan.nextInt();
            String[] arr = new String[n-2] ;
            for (int i = 0; i < n-2; i++) 
                arr[i] = scan.next();
            
            solve(arr, n);
        }
        scan.close();
    }
}
