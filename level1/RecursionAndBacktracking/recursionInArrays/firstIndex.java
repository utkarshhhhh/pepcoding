import java.util.Scanner;

public class firstIndex {

    public static int firstIdx(int[] arr, int idx, int n) {

        if (idx == arr.length)
            return -1;

        if (arr[idx] == n)
            return idx;
        return firstIdx(arr, idx + 1, n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int x = scan.nextInt();
        System.out.println(firstIdx(arr, 0, x));
        scan.close();
    }
}