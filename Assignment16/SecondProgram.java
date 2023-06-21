import java.util.Stack;
public class SecondProgram {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(2);

        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted Stack: " + sortedStack);
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Transfer elements back to the original stack for ascending order
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return stack;
    }
}