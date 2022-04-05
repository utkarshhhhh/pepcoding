import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {

    public static boolean solve(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch == '(' ? ')' : ch == '{' ? '}' : ']');
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.empty() || st.pop() != ch)
                    return false;
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine(); // why nextLine not next
        System.out.println(solve(s));
        scn.close();
    }
}