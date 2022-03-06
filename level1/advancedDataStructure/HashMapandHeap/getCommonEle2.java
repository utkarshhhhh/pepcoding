import java.util.*;

public class getCommonEle2 {
    public static void solve(int[] a, int[] b) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : a) {
            map.put( i , map.getOrDefault(i, 0) + 1);
        }

        for (int i : b) {
            
            if( map.containsKey(i) && map.get(i) > 0 ){
                System.out.println(i);
                map.put(i, map.get(i) -1);
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
