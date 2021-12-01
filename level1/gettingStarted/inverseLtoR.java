import java.util.Scanner;

public class inverseLtoR {

    static int length(int n){
        int count=0;

        while(n>0){
            count++;
            n /= 10;
        }
        
        return count;
    }

    public static int ltoR(int n){

        int ans = 0, len = length(n), last;
        int i=0;
        while(n>0){

            last = n%10;
            n /= 10;
            ans += (len-i++)*(int)Math.pow(10, len-last);
            //System.out.println(ans);

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( ltoR( scan.nextInt() ));
        scan.close();
    }
}
