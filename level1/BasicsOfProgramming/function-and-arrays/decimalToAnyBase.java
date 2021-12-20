import java.util.Scanner;
public class decimalToAnyBase {
    public static int getValueInBase(int n, int b){
     
        int pow = 1, ans = 0;
        while(n!=0){
            int last = n%b;
            n/=b;
            ans += last*pow;
            pow *= 10;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
     }
    
}
