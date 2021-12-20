import java.util.Scanner;

public class pattern13 {
    public static void pattern(int rows){

        
        for(int n=0; n<=rows ; n++){
            int value=1;
            for(int r=0 ; r<=n ; r++){
                System.out.print(value +"\t");
                value = ( (n-r)*value ) / (r+1);
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
