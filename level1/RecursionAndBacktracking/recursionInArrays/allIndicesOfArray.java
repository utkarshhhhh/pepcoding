import java.io.*;

public class allIndicesOfArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int count) {
        // write ur code here
        if (arr.length == idx)
            return new int[count];

        if (arr[idx] == x) {

            int[] ans = allIndices(arr, x, idx + 1, count + 1);
            ans[count] = idx;
            
            return ans;
        } else

            return allIndices(arr, x, idx + 1, count);
    }
}