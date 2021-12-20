import java.util.Scanner;
public class pattern12 {

    public static void pattern(int n){

        int f=0, s=1, t;
        for(int r=1; r<=n ; r++){
            for(int c=1 ; c<=r ; c++){
                System.out.print(f +" ");
                t = f+s;
                f = s;
                s = t;
            }
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
