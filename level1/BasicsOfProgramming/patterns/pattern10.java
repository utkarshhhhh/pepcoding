import java.util.Scanner;

public class pattern10 {

    static void patternR(int n) {

        int nsp1 = n/2, nsp2 = -1 ;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp1; csp++)    // csp 1
                System.out.print("\t");
            
            System.out.print("*\t");

            for (int csp = 1; csp <= nsp2; csp++)   // csp 2
                System.out.print("\t");
            
            if(r != 1 && r != n)
                System.out.print("*\t");
    
        System.out.println();
            
            if( r <= n/2){
                nsp1 -= 1;
                nsp2 += 2;}
            else{
                nsp1 += 1;
                nsp2 -= 2;            
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        patternR(n);

        scan.close();
    }
}
