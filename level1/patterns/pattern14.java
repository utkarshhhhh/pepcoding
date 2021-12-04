import java.util.Scanner;

public class pattern14 {
    static void pattern(int n) {

        for (int r = 1; r <= 10; r++)
                System.out.println(n + "*" + r + "=" + n*r);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        pattern(n);

        scan.close();
    }
}
