import java.util.Scanner;
public class anyBaseToAnyBase {
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
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        
        int inDecimal = getValueIndecimal(n, sourceBase);
        int inBase = getValueInBase(inDecimal, destBase);
        System.out.println(inBase);
        scn.close();
     }
    
}
