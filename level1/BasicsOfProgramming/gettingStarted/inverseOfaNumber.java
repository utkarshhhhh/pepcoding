import java.util.*;

public class inverseOfaNumber {

    public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
    int rev = 0, pow = 1;
    
        while( n>0 ){
            int last = n%10;
            n /= 10;
            rev +=  pow*Math.pow(10,last-1);
            pow++;
        }
    System.out.println(rev);
    sc.close();

    }
}

