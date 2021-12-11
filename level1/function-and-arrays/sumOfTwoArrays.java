import java.util.Scanner;

public class sumOfTwoArrays {
    public static int[] sumArray(int[] arr1, int[] arr2) {

        int carry = 0, i = arr1.length-1 , j = arr2.length-1 ;
        int k = Math.max(i, j);

        int[] ans = new int[k+2];
        while (k>=-1) {

            int add = carry + (i>=0?arr1[i]:0) % 10 + (j>=0?arr2[j]:0) % 10;

            i--; j--;

            carry = add / 10;
            add = add % 10;

            ans[k-- + 1] = add;

        }
        return ans;
    }

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr1 = new int[n];

        for(int i=0 ; i<n ; i++)
        arr1[i] = scan.nextInt();

        int m = scan.nextInt();
        int[] arr2 = new int[m];

        for(int i=0 ; i<m ; i++)
        arr2[i] = scan.nextInt();
        
        int[] dn = sumArray(arr1, arr2);

        if(dn[0] != 0)
        System.out.println(dn[0]);

        for (int i=1 ; i<dn.length ; i++) {
            System.out.println( dn[i] );    
        }
        
        scan.close();
    }
}
