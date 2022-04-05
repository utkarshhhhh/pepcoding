import java.io.*;
import java.util.*;

public class infixConversions {

    public static int precedence(char c) {
        if (c == '+' || c == '-')
            return 1;
        return 2;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String postf(String a, String b, char c) {
        return b + a + c;
    }

    public static String pref(String a, String b, char c) {
        return c + b + a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // code

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') ) {
                prefix.push(c + "");
                postfix.push(c + "");
            } else if (c == '(') {
                operator.push(c);
            } else if (c == ')') {

                // System.out.println(prefix);
                // System.out.println(postfix);
                // System.out.println(operator);

                while (operator.peek() != '(') {

                    char op = operator.pop();

                    String pre = pref(prefix.pop(), prefix.pop(), op);
                    String post = postf(postfix.pop(), postfix.pop(), op);

                    prefix.push(pre);
                    postfix.push(post);
                }
                operator.pop();
            } else if (isOperator(c)) {

                // remember while
                while (!operator.isEmpty() && operator.peek() != '('
                        && precedence(c) <= precedence(operator.peek())) {

                    char op = operator.pop();

                    String pre = pref(prefix.pop(), prefix.pop(), op);
                    String post = postf(postfix.pop(), postfix.pop(), op);

                    prefix.push(pre);
                    postfix.push(post);

                }
                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {

            char op = operator.pop();

            String pre = pref(prefix.pop(), prefix.pop(), op);
            String post = postf(postfix.pop(), postfix.pop(), op);

            prefix.push(pre);
            postfix.push(post);
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }
}