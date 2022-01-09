import java.util.Scanner;

public class targetSumSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int tar = scn.nextInt();

        printTargetSumSubsets(arr, 0, "", 0, tar);
        scn.close();
    }

    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sum, int tar) {
        if (sum > tar)
            return;
        if (idx == arr.length) {
            if (sum == tar)
                System.out.println(set + '.');
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sum + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sum, tar);
    }
}
