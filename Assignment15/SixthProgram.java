 import java.util.Stack;
public class SixthProgram {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert character to integer and push onto stack
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;

                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "234*+";
        int result = evaluatePostfix(postfixExpression);

        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Result: " + result);
    }
}