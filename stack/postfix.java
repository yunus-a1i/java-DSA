package stack;

import java.util.Stack;

public class postfix {

    public static boolean isOp(char x) {
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
            default:
                return false;
        }
    }

    public static int priority(char x) {
        switch (x) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    public static String fun(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') continue;

            if (ch == '(') st.push(ch);

            else if (ch == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop();
            } else if (!isOp(ch)) ans.append(ch);
            else {
                while (!st.empty() && priority(st.peek()) >= priority(ch)) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.empty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(fun(s));
    }
}
