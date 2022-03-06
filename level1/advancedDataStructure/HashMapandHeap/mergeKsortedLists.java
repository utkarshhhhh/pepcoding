import java.io.*;
import java.util.*;

public class mergeKsortedLists {

    public static class triplet implements Comparable<triplet> {
        int li; // listIDX
        int idx; // curIdx
        int val;

        triplet() {
        }

        triplet(int li, int idx, int val) {
            this.li = li;
            this.idx = idx;
            this.val = val;
        }

        public int compareTo(triplet o) {
            return this.val - o.val;
        }
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> ans = new ArrayList<>();

        // write your code here
        PriorityQueue<triplet> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.size(); i++) {
            triplet temp = new triplet(i, 0, lists.get(i).get(0));
            pq.add(temp);
        }

        while (!pq.isEmpty()) {

            triplet temp = pq.remove();
            ans.add(temp.val);

            int liIdx = temp.li;
            int newIdx = temp.idx + 1;

            if (newIdx < lists.get(liIdx).size()) {
                int newVal = lists.get(liIdx).get(newIdx);

                triplet top = new triplet(liIdx, newIdx, newVal);
                pq.add(top);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}