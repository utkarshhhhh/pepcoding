import java.util.Scanner;

class powerLog{
    public static int pow(int x,int n){
        
        if(n==0) return 1;

        int ans = pow(x, n/2);
        return n%2==0? ans*ans : ans*ans*x;
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(pow(x,n));
        scn.close();
    }
}