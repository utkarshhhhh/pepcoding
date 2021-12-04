import java.util.Scanner;

public class pattern8 {
    static void pattern(int n) {

        for(int r=1 ; r<=n ; r++){
            for(int c=1 ; c<=n ; c++){
                if(r+c == n+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        pattern(n);

        scan.close();
    }
}
