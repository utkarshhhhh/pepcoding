import java.util.Scanner;

class pattern1 {

    static void pattern0(int n) {

        int nsp = n, nst = n;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            System.out.println();
            nsp += 0;
            nst += 0;
        }
    }
    
    static void pattern(int n) {

        int nsp = n-1, nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            System.out.println();
            nsp -= 1;
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