import java.util.Scanner;

public class toggleCase {

    public static String toggle(String str) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a')
                ans.append( (char)(c + 'A' - 'a'));

            else
                ans.append( (char)(c - 'A' + 'a'));

        }
        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(toggle(str));
        //System.out.println((int)'a');
        scan.close();
    }
}