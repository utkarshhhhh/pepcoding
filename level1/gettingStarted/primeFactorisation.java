import java.util.*;

public class primeFactorisation {

    public static void main(String[] args) {
    // write your code here  
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    for(int i=2 ; i*i<=n ; i++){
        
        while(n%i==0){
            System.out.print(i+" ");
            n/=i;
        }
    }

    if(n!=1)           
        System.out.print(n);
    
    scan.close();
    }
}

