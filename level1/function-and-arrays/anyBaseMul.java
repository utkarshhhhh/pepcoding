import java.util.Scanner;

public class anyBaseMul {
    public static int deciamlAdd(int n,int m, int b) {
    
        int value = 1, ans = 0, carry =0;
        while(n!=0 || m!=0 || carry != 0){
            
            int add = carry + n%10 + m%10 ;
    
            n /= 10; m /= 10;
    
            carry = add/b;
            add = add%b;
    
            ans += add*value;
            value *= 10;
            
        }
        return ans;
    }
    
    public static int deciamlMul1(int n,int m, int b) {
    
        int value = 1, ans = 0, carry =0;
        while( n!=0 || carry != 0){
            
            int mul = carry + ( n%10 )*( m );
    
           n /= 10;
    
            carry = mul/b;
            mul %= b;
    
            ans += mul*value;
            value *= 10;
            
        }
        return ans;
    }

    public static int deciamlMul(int n,int m, int b) {
    
        int value = 1, ans = 0;
        while( m!=0){
            
            int mul = deciamlMul1(n, m%10, b);
    
           m /= 10;

            ans = deciamlAdd(ans, mul*value, b);
            value *= 10;
            
        }
        return ans;
    }

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(deciamlMul(n, m, b) );
            scan.close();
        }
    
}
