import java.util.*;

public class pythagorianTriplet {   

    public static void main(String[] args) {
        // write your code here  
        Scanner scan = new Scanner(System.in);
    
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a>c){
            int temp = a;
            a = c; 
            c = temp;
        }
        if(b>c){
            int temp = b;
            b = c; 
            c = temp;
        }
        
        System.out.println( a*a + b*b == c*c);
        scan.close();
    }
}
