import java.io.*;
import java.util.*;

public class postfixEval {

    public static int precedence(char c) {
        if (c == '+' || c == '-')
            return 1;
        return 2;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String inf(String a, String b, char c) {
        return '(' + b + c + a + ')';
    }

    public static String pref(String a, String b, char c) {
        return c + b + a;
    }

    public static int postf(int b, int a, char c) {

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

        Stack<String> prefix = new Stack<>();
        Stack<Integer> postfix = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                prefix.push(c + "");
                infix.push(c + "");
                postfix.push(c - '0');
            } else if (isOperator(c)) {

                    char op = c;

                    String pre = pref(prefix.pop(), prefix.pop(), op);
                    String infi = inf(infix.pop(), infix.pop(), op);
                    int ans = postf(postfix.pop(), postfix.pop(), op);

                    prefix.push(pre);
                    infix.push(infi);
                    postfix.push(ans);
             
                operator.push(c);
            }
        }

        System.out.println(postfix.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }
}