import java.util.Scanner;

public class subsetOfArray {

    public static void subset(int[] a) {
        // write your code here

        int n = (int) Math.pow(2, a.length);
        for (int start = 0; start < n; start++) {

            int num = start;
            String str = "";
            for (int end = a.length - 1; end >= 0; end--) {
                // for(int end=0 ; end<a.length ; end++){

                if (num % 2 == 0)
                    str = "-\t" + str;
                else
                    str = a[end] + "\t" + str;

                num /= 2;
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        subset(arr);
        scan.close();
    }
}
