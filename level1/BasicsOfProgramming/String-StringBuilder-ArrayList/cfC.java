import java.util.Scanner;

public class cfC {

    public static long lcm(long a, long b) {

        if (b == 0)
            return a;
        return lcm(b, a % b);
    }

    public static long solve(long[] arr) {

        long lcm1 = arr[0], lcm2 = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (i % 2 == 0)
                lcm1 = lcm(lcm1, arr[i]);
            else
                lcm2 = lcm(lcm2, arr[i]);
            
            if(arr[i] == arr[i-1]) return 0;
        }

        if (lcm1 == lcm2)
            return 0;
        else {

            if( lcm1 > lcm2 ){
                for (int i = 1; i < arr.length; i+=2) {
                    if(  arr[i]%lcm1 == 0) return 0;
                }
            }else {
                for (int i = 0; i < arr.length; i+=2) {
                    if(  arr[i]%lcm2 == 0) return 0;
                }
            }
            
        }
        
        return Math.max(lcm1, lcm2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = scan.nextLong();

            System.out.println(solve(arr));
            // System.out.println(arr[0]+" "+arr[1]+" " + (arr[6] - arr[0] - arr[1]));
        }
        scan.close();
    }
}
