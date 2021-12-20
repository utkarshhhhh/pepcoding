import java.util.Scanner;

public class pattern18 {
    static void pattern(int n) {

        int nsp1 = 1, nsp2 = n-4 , nst = -1;

        for (int r = 1; r <= n; r++) {

            if(r==1){
                for (int cst = 1; cst <= n; cst++)    
                    System.out.print("*\t");
                    System.out.println();
                    continue;
            }

            for (int csp = 1; csp <= nsp1; csp++)    // csp 1
                System.out.print("\t");
            
            System.out.print("*\t");

            for (int csp = 1; csp <= nsp2; csp++)   // csp 2
                System.out.print("\t");
            
            for (int cst = 1; cst <= nst; cst++)   // csp 2
                System.out.print("*\t");
            
            if(r != n/2 +1)
                System.out.print("*\t");
    
        System.out.println();
            
            if( r <= n/2){
                nsp1 += 1;
                nsp2 -= 2;}
            else{
                nsp1 -= 1;
                nst += 2;            
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
