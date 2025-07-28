
import java.util.Stack;

public class InpixToPostpix {

    boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
            return true;
        } else {
            return false;
        }

    }

    void infixtopostfix(String str) {
        int l = str.length();
        Stack stack = new Stack();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (isOperand(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (stack.peek() != "(") {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(ch)) {

            }

        }
    }

    public static void main(String[] args) {

    }
}
