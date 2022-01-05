import java.util.Scanner;

public class printEncoding {

    public static void printEncodings(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        if (str.charAt(0) == '0') {
            return;
        }

        char c = (char) (str.charAt(0) + 'a' - '1');
        printEncodings(str.substring(1), ans + c);

        if (str.length() > 1) {

            char ch = (char) ((c - 'a' + 1) * 10 + str.charAt(1) + 'a' - '1');

            if (ch >= 'a' && ch <= 'z')
                printEncodings(str.substring(2), ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printEncodings(str, "");
        scan.close();
    }
}