package lab4_notic;

import java.util.Stack;

class InfixToPostfix {

    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        String result = "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            } else
            {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }

        }

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }
}
