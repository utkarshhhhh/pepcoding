import java.util.*;

public class exitPointOfMatrix {
    public static void exit(int[][] arr) {

        int dir = 0;
        int i=0 , j=0;
        
        while ( true ) {
            dir += arr[i][j];
            dir %= 4;

            if (dir == 0) {
                j++;
            } else if(dir == 1){
                i++;
            }else if(dir ==2 ){
                j--;
            }else{
                i--;
            }

            if( i<0 || j<0 || i==arr.length || j==arr[0].length)
            break;
        }

        if(i<0) i++;
        else if(j<0) j++;
        else if(i==arr.length) i--;
        else j--;
        
        System.out.println(i);
        System.out.println(j);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        exit(arr);

        scan.close();
    }
}
