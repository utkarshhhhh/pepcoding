import java.util.Scanner;

public class reverseAnumber {

    public static void printDigit(int num){
        
        while(num>0){
            System.out.println( num%10 );
            num /= 10;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDigit(n);
        scn.close();
    }
}
