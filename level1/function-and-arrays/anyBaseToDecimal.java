import java.util.Scanner;

public class anyBaseToDecimal {
    public static int getValueIndecimal(int n, int b){
     
        int pow = 1, ans = 0;
        while(n!=0){
            int last = n%10;
            n/=10;
            ans += last*pow;
            pow *= b;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueIndecimal(n, b);
        System.out.println(dn);
        scn.close();
    }
}
