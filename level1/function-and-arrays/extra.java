import java.util.Scanner;


public class extra {
    
public static void decimalToBinary(int n) {
    
    int pow = 1, ans = 0;
    while(n!=0){
        int last = n%2;
        n/=2;
        ans += last*pow;
        pow *= 10;
    }
    System.out.println(ans);
}

public static void binaryToDecimal(int n) {
    
    int value = 0, ans = 0;
    while(n!=0){
        int last = n%10;
        ans += last*(int)Math.pow(2, value++);
        n/=10;
    }
    System.out.println(ans);
}
    
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



public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(deciamlAdd(n, m, b) );
        scan.close();
    }
}
