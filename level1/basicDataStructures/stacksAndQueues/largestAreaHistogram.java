import java.io.*;
import java.util.Stack;

public class largestAreaHistogram {
    public static int largestRectangleArea(int[] heights) {
        
        int ans = 0;

        int[] left = nsol(heights);
        int[] right = nsor(heights);

        for (int i = 0; i < right.length; i++) {
            ans = Math.max(ans, heights[i]*( right[i] - left[i] -1 )   );
        }

        return ans;
    }

    public static int[] nsol (int[] arr){

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }

        for (int i = n-1; i >= 0 ; i--) {
            
            while ( !st.isEmpty() && arr[ st.peek() ] > arr[i] ) {
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] nsor (int[] arr){

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ans.length; i++) {
            ans[i] = n;
        }

        for (int i = 0; i <n ; i++) {
            
            while ( !st.isEmpty() && arr[ st.peek() ] > arr[i] ) {
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        // code
        System.out.println( largestRectangleArea(a) );
     }
}
