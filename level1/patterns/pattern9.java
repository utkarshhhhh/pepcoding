import java.util.Scanner;

public class pattern9 {
    static void pattern(int n) {

        for(int r=1 ; r<=n ; r++){
            for(int c=1 ; c<=n ; c++){
                if(r+c == n+1 || r==c)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    static void patternR(int n) {

        int nsp1 = 0, nsp2 = n-2 ;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp1; csp++)    // csp 1
                System.out.print("\t");
            
            System.out.print("*\t");

            for (int csp = 1; csp <= nsp2; csp++)   // csp 1
                System.out.print("\t");
            
            if(r != n/2 +1)
                System.out.print("*\t");
    
            System.out.println();
            
            if( r <= n/2){
                nsp1 += 1;
                nsp2 -= 2;}
            else{
                nsp1 -= 1;
                nsp2 += 2;            
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
