import java.util.Scanner;
import java.util.Stack;

public class duplicateBrackets {

    public static boolean solve(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {

                if (st.peek() == '(')
                    return true;

                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();  // why nextLine not next
        System.out.println(solve(s));
        scn.close();
    }
}