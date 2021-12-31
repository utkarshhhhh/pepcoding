import java.util.Scanner;

public class printStairPath {

    public static void printStairPaths(int n, String path) {

        if(n == 0){
            System.out.println(path);
            return;
        }
        
        for (int i = 1; i <= 3 && n-i>=0 ; i++) 
            printStairPaths(n-i, path + i);
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printStairPaths(n, "");
        scan.close();
    }
}