import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class mergeOverlappingIntv {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        Stack<int[]> st = new Stack<>();
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            int[] t = st.pop();

            int s1 = t[0];
            int e1 = t[1];

            int[] c = arr[i];

            int s2 = c[0];
            int e2 = c[1];

            if (e1 >= s2) {

                st.push(new int[] { s1, Math.max(e2, e1) });
            } else {
                st.push(t);
                st.push(c);
            }
        }

        int[][] ans = new int[st.size()][2];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        for (int[] is : ans) {
            System.out.println(is[0] + " " + is[1]);
        }

    }
}
