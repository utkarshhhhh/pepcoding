import java.util.*;

public class rotateNumber {
    public static void main(String[] args) {
        // write your code here  
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int t = n,c=0;
        while(t>0){
            t /= 10;
            c++;
        }
        
        if(k<0){
            k = -k;
            k = k%c;
            k = c-k;
        }else {
            k = k%c;
        }
        
        t = (int)(n%Math.pow(10,k));
        n /= Math.pow(10,k);
        t = (int)(t*Math.pow(10,c-k)) + n;
        
        System.out.println(t);
        scan.close();
    }
}
