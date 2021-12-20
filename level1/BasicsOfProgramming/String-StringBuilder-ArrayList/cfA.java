import java.util.Scanner;

public class cfA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int[] arr = new int[7];
        while (t-->0) {
            
            for (int i = 0; i < 7; i++) 
                arr[i] = scan.nextInt();
            
            System.out.println(arr[0]+" "+arr[1]+" " + (arr[6] - arr[0] - arr[1]));
        }
        scan.close();
    }
}
