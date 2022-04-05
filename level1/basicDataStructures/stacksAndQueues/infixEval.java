import java.io.*;
import java.util.*;

public class infixEval {

    public static int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else
            return 2;
    }

    public static boolean isOtpr(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int calVal(int a, int b, char c) {
        
        if (c == '+') 
            return a+b;
        else if (c == '-') 
            return a-b;
        else if (c == '*') 
            return a*b;
        else if (c == '/')
            return a/b;
            
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            
            char ch = exp.charAt(i);

            if( ch == '(' ){
                operator.push(ch);
            }else if (ch == ')') {
                
                while (operator.peek()!='(') {
                    char op = operator.pop();
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push( calVal(a, b, op) );
                }
                operator.pop();

            }else if( ch >= '0' && ch <= '9' ){
                operand.push(ch-'0');
            }else if (isOtpr(ch)) {
                
                while ( operator.size() > 0 && operator.peek() != '(' && precedence( operator.peek() ) >= precedence(ch) ) {
                    char op = operator.pop();
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push( calVal(a, b, op) );
                }
                operator.push(ch);
            }
        }

        while ( operator.size() > 0 ){
            char op = operator.pop();
            int b = operand.pop();
            int a = operand.pop();
            operand.push( calVal(a, b, op) );
        }

        System.out.println( operand.pop() );

    }
}