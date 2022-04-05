import java.io.*;
import java.util.*;

public class prefixEval {

    public static int precedence(char c) {
        if (c == '+' || c == '-')
            return 1;
        return 2;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String inf(String a, String b, char c) {
        return '(' + a + c + b + ')';
    }

    public static String postf(String a, String b, char c) {
        return a + b + c ;
    }

    public static int pref(int a, int b, char c) {

        if (c == '+')
            return a + b;
        else if (c == '-')
            return a - b;
        else if (c == '*')
            return a * b;
        else if (c == '/')
            return a / b;

        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // code

        Stack<String> postfix = new Stack<>();
        Stack<Integer> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = s.length()-1 ; i>=0 ; i--) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                postfix.push(c + "");
                infix.push(c + "");
                prefix.push(c - '0');
            } else if (isOperator(c)) {

                    char op = c;

                    String post = postf(postfix.pop(), postfix.pop(), op);
                    String infi = inf(infix.pop(), infix.pop(), op);
                    int ans = pref(prefix.pop(), prefix.pop(), op);

                    postfix.push(post);
                    infix.push(infi);
                    prefix.push(ans);
             
                operator.push(c);
            }
        }

        System.out.println(prefix.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
    }
}