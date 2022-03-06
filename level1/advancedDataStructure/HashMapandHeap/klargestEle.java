import java.util.*;
import java.io.*;

public class klargestEle {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solve(n, num, k);
        scn.close();
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array,n length of array and k.
    // It should print required output.
    public static void solve(int n, int[] arr, int k) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<n ; i++){

            if(i<k){
                pq.add(arr[i]);
            }else{
                pq.add(arr[i]);
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i = 0;

        while (!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }

        while (--i>=0) {
            System.out.print(ans[i] + " ");
        }
		
    }
}