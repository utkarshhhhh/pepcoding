import java.io.*;
import java.util.*;

public class writePQusingHeap {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapify(size()-1);
    }

    public void swap(int i, int j){
        int v1 = data.get(i);
        int v2 = data.get(j);

        data.set(i, v2);
        data.set(j, v1);
    }

    public void upheapify(int idx){
        if (idx == 0) {
            return;
        }

        int pi = (idx-1)/2;

        if (data.get(idx) < data.get(pi) ) {
            swap(idx, pi);
            upheapify(pi);
        }
    }

    public int remove() {
      // write your code here
      int val = peek();
      if (val == -1) {
          return val;
      }
      swap(0, size()-1);
      data.remove( data.size()-1 );
      downheapify( 0 );

      return val;
    }

    public void downheapify(int pi) {
        
        int minIdx = pi;

        int left = 2*pi + 1;
        int right = 2*pi + 2;

        if (left < size() && data.get(left) < data.get(minIdx)) {
            minIdx = left;
        }
        if (right < size() && data.get(right) < data.get(minIdx)) {
            minIdx = right;
        }

        if (minIdx != pi) {
            swap(minIdx, pi);
            downheapify(minIdx);
        }
    }

    public int peek() {
      // write your code here
      if (size() == 0) {
        System.out.println("Underflow");  
        return -1;
      }
      return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}