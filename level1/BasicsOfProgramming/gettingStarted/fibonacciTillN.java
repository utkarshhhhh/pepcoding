import java.util.Scanner;

public class fibonacciTillN {
  
    public static void fibonacci(int n){
        int a = 0 , b=1 , c, count=0;

        while(count<n){
            count++;
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        int n = scn.nextInt();
        fibonacci(n);
        scn.close();
     }
}