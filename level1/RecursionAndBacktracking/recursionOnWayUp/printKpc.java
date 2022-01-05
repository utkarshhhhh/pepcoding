import java.util.Scanner;

public class printKpc {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char c = str.charAt(0);
        String code = codes[c - '0'];

        for (int i = 0; i < code.length(); i++)
            printKPC(str.substring(1), ans + code.charAt(i));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printKPC(str, "");
        scan.close();
    }
}