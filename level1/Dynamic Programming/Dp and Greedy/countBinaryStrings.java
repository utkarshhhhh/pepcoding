import java.util.Scanner;

public class countBinaryStrings {


    public static long count(int n) {
        
        long oldOne = 1, oldZero = 1;
        
        for(int i=2 ; i<=n ; i++){
            long newZero = (oldOne + oldZero);
            long newOne = oldZero;
            
            oldOne = newOne;
            oldZero = newZero;
        }
        return oldOne + oldZero;        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println( count(n) );

        scan.close();
    }
}
