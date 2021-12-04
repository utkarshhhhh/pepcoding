import java.util.Scanner;

public class pattern6 {
    static void pattern(int n) {

        int nsp = 1, nst = (n+2)/2;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
    
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
    
            System.out.println();
            if( r <= n/2){
                nsp += 2;
                nst -= 1;}
            else{
                nsp -= 2;
                nst += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        pattern(n);

        scan.close();
    }
}
