import java.util.Scanner;

public class anyBaseSubtraction {
    public static int decimalSub(int n,int m, int b) {
    
        int value = 1, ans = 0, carry =0, sub =0;
        while(n!=0 || m!=0 || carry != 0){
            
            int last1 = n%10, last2 = m%10;
            n /= 10; m /= 10;
    
            sub = carry + last1 - last2 ;
            
            carry = sub<0? -1: 0;
            sub = sub<0? sub+b : sub;
    
            ans += sub*value;
            value *= 10;
        }
        return ans;
    }
    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(decimalSub(n, m, b) );
            scan.close();
        }
    
}
