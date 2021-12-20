import java.util.Scanner;

public class digitsOfaNumber {

    public static int countDigit(int n){
        int count=0;

        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static void printDigit(int num, int n){
        
        while(n>=0){
            System.out.println( num/(int)Math.pow(10, n)  );
            num = num%(int)Math.pow(10, n--);
        }
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDigit(n, countDigit(n)-1);
        scn.close();
    }
}
