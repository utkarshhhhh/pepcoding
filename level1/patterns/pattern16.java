import java.util.Scanner;

public class pattern16 {
    static void pattern(int n) {

        int nsp = 2*n-3, nst = 1, count = 0;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++){
                System.out.print( ++count +"\t");
                
            }
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            
            if(r==n) {nst--; count--;}
            for (int cst = 1; cst <= nst; cst++){
                System.out.print( count--+"\t");
            }
            System.out.println();
                nsp -= 2;
                nst += 1;
            
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        pattern(n);

        scan.close();
    }
}
