import java.util.Scanner;

public class pattern5 {
    static void pattern(int n) {

        int nsp = n/2, nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
    
            System.out.println();
            if( r <= n/2){
                nsp -= 1;
                nst += 2;}
            else{
                nsp += 1;
                nst -= 2;
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
