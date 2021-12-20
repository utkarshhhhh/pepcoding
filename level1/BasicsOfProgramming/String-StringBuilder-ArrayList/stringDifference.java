import java.util.Scanner;

public class stringDifference {

    public static String difference(String str) {

        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

                ans.append( (curr-prev));
                ans.append( curr);
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(difference(str));
        //System.out.println((int)'a');
        scan.close();
    }
}