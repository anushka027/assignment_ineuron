import java.util.*;
public class SecondProgram {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '*') {
                stack.push(c);
            } else if (!stack.isEmpty() && (c == ')' || c == '*')) {
                stack.pop();
            } else {
                return false;
            }
        }

        int openCount = 0;

        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == '(') {
                openCount++;
            } else if (openCount > 0) {
                openCount--;
            }
        }

        return openCount == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        boolean isValid = isValid(s);
        System.out.println("Is the string valid? " + isValid);
    }
}
