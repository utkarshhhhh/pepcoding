import java.util.Scanner;

public class countDigits {

    public static int countDigit(int n){
        int count=0;

        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(countDigit(scn.nextInt()));
        scn.close();
        
    }
}
