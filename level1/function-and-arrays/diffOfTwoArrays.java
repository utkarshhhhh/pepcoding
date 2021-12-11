import java.util.Scanner;

public class diffOfTwoArrays {
    public static int[] diffArray(int[] arr1, int[] arr2) {

        int carry = 0, i = arr1.length-1 , j = arr2.length-1 ;
        int k = Math.max(i, j);

        int[] ans = new int[k+1];
        while (k>=0) {

            int sub = carry  + arr2[j];
            sub -= i>=0?arr1[i]:0;

            carry = sub<0 ? -1 : 0;
            sub += sub<0? 10:0;
            i--; j--;

            ans[k--] = sub;
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
        
        int[] dn = diffArray(arr1, arr2);
        int i=0;

        while( i<dn.length &&  dn[i] == 0)
            i++;

        if(i==dn.length)
        System.out.println(0);
        else
            for ( ; i<dn.length ; i++) {
                System.out.println( dn[i] );    
            }
            
        scan.close();
    }
}
