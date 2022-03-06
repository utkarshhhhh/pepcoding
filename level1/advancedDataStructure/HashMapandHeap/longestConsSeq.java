import java.util.HashMap;
import java.util.Scanner;

public class longestConsSeq {

    public static void solve(int[] arr) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i-1)) {
                map.put(i, false);
            }else
                map.put(i, true);
        }

        int maxLen = 1, st = 0;

        for ( int i: arr ) {
            if (map.get(i)) {
                int len = 1;
                
                while( map.containsKey(i+ len) ){
                    len++;
                }

                if( maxLen < len){
                    maxLen = len;
                    st = i;
                }
            }
        }

        for (int i = st; i < st + maxLen; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        solve(arr);
        scan.close();
    }     
}