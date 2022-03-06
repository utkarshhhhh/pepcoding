import java.io.*;
import java.util.PriorityQueue;

public class sortKSortedarr {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {

            if (i < k + 1) {
                pq.add(arr[i]);
            } else {

                System.out.println(pq.poll());
                pq.add(arr[i]);

            }

        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
