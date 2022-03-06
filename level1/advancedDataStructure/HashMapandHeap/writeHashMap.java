import java.io.*;
import java.util.*;

public class writeHashMap {

    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        private int findBucketIdx(K key) {

            int hc = key.hashCode();
            int bi = Math.abs(hc) % buckets.length;

            return bi;
        }

        private int findDataIdxiniBucket(K key, int bi) {

            LinkedList<HMNode> tmp = buckets[bi];

            for (int i = 0; i < tmp.size(); i++) {
                HMNode cur = tmp.get(i);
                if (key.equals(cur.key)) {
                    return i;
                }
            }
            return -1;
        }

        private void rehashing() throws Exception {

            LinkedList<HMNode>[] prevBuckets = buckets;

            initbuckets(2 * prevBuckets.length);
            size = 0;

            for (int bi = 0; bi < prevBuckets.length; bi++) {
                for (int p = 0; p < prevBuckets[bi].size(); p++) {
                    HMNode curNode = prevBuckets[bi].get(p);
                    put(curNode.key, curNode.value);
                }
            }
        }

        public void put(K key, V value) throws Exception {
            // write your code here
            int bi = findBucketIdx(key);
            int di = findDataIdxiniBucket(key, bi);

            if (di == -1) {
                LinkedList<HMNode> temp = buckets[bi];
                HMNode node = new HMNode(key, value);
                temp.add(node);
                size++;
            } else {
                LinkedList<HMNode> temp = buckets[bi];
                HMNode node = temp.get(di);
                node.value = value;
            }

            double lambda = size * (1.0) / buckets.length;

            if (lambda > 2)
                rehashing();

        }

        public V get(K key) throws Exception {
            int bi = findBucketIdx(key);
            int di = findDataIdxiniBucket(key, bi);

            if (di == -1) {
                return null;
            } else {
                LinkedList<HMNode> temp = buckets[bi];
                HMNode node = temp.get(di);
                return node.value;
            }        
        }

        public boolean containsKey(K key) {
            int bi = findBucketIdx(key);
            int di = findDataIdxiniBucket(key, bi);

            if (di == -1) {
                return false;
            } else {
                return true;
            }        
        }

        public V remove(K key) throws Exception {
            int bi = findBucketIdx(key);
            int di = findDataIdxiniBucket(key, bi);

            if (di == -1) {
                return null;
            } else {
                LinkedList<HMNode> temp = buckets[bi];
                HMNode node = temp.remove(di);
                size--;
                return node.value;
            }   
        }

        public ArrayList<K> keyset() throws Exception {
            
            ArrayList<K> ans = new ArrayList<>();
            
            for (int bi = 0; bi < buckets.length; bi++) {
                for (int p = 0; p < buckets[bi].size(); p++) {
                    HMNode curNode = buckets[bi].get(p);
                    ans.add(curNode.key);
                }
            }
            return ans;
        }

        public int size() {
            return this.size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}