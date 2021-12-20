import java.util.Scanner;

public class isNoPrime {
    public static void func(int n){
        int count = 0;
        for(int i=2 ; i*i<=n ;i++){
             if( n%i == 0){
                 count++; break;
             }
         }
         if(count == 0)
              System.out.println("prime");
          else
              System.out.println("not prime");
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          
          int t = scn.nextInt();
          while(t-->0){
          int n = scn.nextInt();    
          func(n);
          }
          
         scn.close();
     }
}
