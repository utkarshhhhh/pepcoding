import java.util.Scanner;

public class lastIndex {

    public static int lastIdx(int[] arr, int idx, int n) {

        if (idx == arr.length)
            return -1;

        int ans = lastIdx(arr, idx + 1, n);
        
        return arr[idx] == n ? Math.max(idx, ans) : ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int x = scan.nextInt();
        System.out.println(lastIdx(arr, 0, x));
        scan.close();
    }
}