import java.util.Scanner;

public class allPrimesTillN {
  
  public static int func(int n){
      int count = 0;
      for(int i=2 ; i*i<=n ;i++){
           if( n%i == 0){
               count++; break;
           }
       }
       return count;
  }
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
        int l = scan.nextInt();
        int h = scan.nextInt();    

        for ( ; l<=h ; l++){
        
         if (func(l)==0)
         System.out.println(l);
        }

      scan.close();
   }
}
