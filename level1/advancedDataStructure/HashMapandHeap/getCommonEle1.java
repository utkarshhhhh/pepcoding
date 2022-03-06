import java.util.*;

public class getCommonEle1 {
    public static void solve(int[] a, int[] b) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put( a[i] , 1);
        }

        for (int i : b) {
            
            if( map.containsKey(i) ){
                System.out.println(i);
                map.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = scan.nextInt();
        }

        solve(arr, arr1);
        scan.close();
    }
}
