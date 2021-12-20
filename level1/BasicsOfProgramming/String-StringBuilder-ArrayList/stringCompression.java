import java.util.Scanner;

public class stringCompression {

    public static void compress(String str) {

        char c = str.charAt(0);
        int count = 1;
        String ans = new String(str.charAt(0) + "");
        String ans2 = new String(str.charAt(0) + "");

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(i - 1)) {
                c = str.charAt(i);
                ans += c;
                ans2 += count == 1 ? c : count + "" + c;

                count = 1;
            } else {
                count++;
            }
        }
        ans2 += count == 1 ? "" : count;
        System.out.println(ans + "\n" + ans2);
        // return ans;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // System.out.println(compress(str));
        compress(str);
        scan.close();
    }
}