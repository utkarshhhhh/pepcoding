import java.util.*;

public class gcdLcm {
    static int gcd(int a,int b){
        
        if(b==0) return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scan = new Scanner(System.in);
      
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      int g = gcd(a,b);
      System.out.println(g);
      System.out.println( (a/g)*b);
      scan.close();

     }
}
