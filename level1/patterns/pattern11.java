import java.util.Scanner;
public class pattern11 {

    public static void pattern(int n){

        int a=1;
        for(int r=1; r<=n ; r++){
            for(int c=1 ; c<=r ; c++)
                System.out.print(a++ +" ");
            System.out.println();
        } 
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);
        
        scan.close();
    }
    
}
