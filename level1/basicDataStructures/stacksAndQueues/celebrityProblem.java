import java.io.*;
import java.util.Stack;

public class celebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }


        while ( st.size() >= 2 ) {
            
            int a = st.pop();
            int b = st.pop();

            if( arr[a][b] == 1 )
                st.push(b);
            else
                st.push(a);
        }

        if( check(arr, st.peek() ) ){
            System.out.println( st.pop() );
        }else
            System.out.println("none");

    }

    public static boolean check(int[][] arr, int x) {
        // remember x
        for (int i = 0; i < arr.length; i++) {
            if ( (arr[i][x] != 1 && i!=x) || arr[x][i] != 0 ) 
                return false;
        }

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i][x] != 1 && i!=x) 
        //         return false;
        // }
        return true;
    }

}