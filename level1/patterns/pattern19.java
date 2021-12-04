import java.util.Scanner;

public class pattern19 {

    static boolean check(int r, int c, int n){

        boolean mid = r == n/2 +1 || c == n/2 +1;
        boolean r1 = r==1&& c<=n/2;
        boolean cn = c==n&& r<=n/2;
        boolean rn = r==n&& c>n/2;
        boolean c1 = c==1&& r>n/2;

        return mid||c1||r1||rn||cn;
    }
    static void pattern(int n) {

        //int nsp1 = 1, nsp2 = n-4 , nst1 = -1, nst2 = 1;

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) { 

                if( check(r, c, n) )
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        pattern(n);

        scan.close();
    }
}
