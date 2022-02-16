import java.util.Scanner;

public class countabc {

    public static int solve(String s) {

        int a = 0, ab = 0, abc = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a')
                a = 2 * a + 1;
            else if (s.charAt(i) == 'b')
                ab = 2 * ab + a;
            else if (s.charAt(i) == 'c')
                abc = 2 * abc + ab;
        }
        return abc;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        System.out.println(solve(n));
        scan.close();
    }
}
