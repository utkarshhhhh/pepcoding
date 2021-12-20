import java.util.Scanner;

public class pattern17 {

    static void pattern(int n) {

        int nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= n/2; csp++)
                if(r != n/2+1)
                System.out.print("\t");
                else
                System.out.print("*\t");

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (r <= n / 2)
                nst += 1;
            else 
                nst -= 1;
            
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        pattern(n);

        scan.close();
    }
}
