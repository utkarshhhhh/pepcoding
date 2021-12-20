import java.util.Scanner;

class printDecreasing{
    public static void printDec(int n){
        
        if(n==0) return;
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDec(n);
        scn.close();
    }
}