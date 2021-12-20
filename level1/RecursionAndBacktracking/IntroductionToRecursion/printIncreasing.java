import java.util.Scanner;

class printIncreasing{
    public static void printInc(int n){
        
        if(n==0) return;
        printInc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printInc(n);
        scn.close();
    }
}