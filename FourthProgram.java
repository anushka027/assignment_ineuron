import java.util.Stack;
public class FourthProgram {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return; // Base case
        }

        int topElement = stack.pop(); // Remove the top element

        reverseStack(stack); // Recursively reverse the remaining stack

        insertAtBottom(stack, topElement); // Insert the top element at the bottom
    }

    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int topElement = stack.pop(); // Remove the top element

        insertAtBottom(stack, element); // Recursively insert at bottom

        stack.push(topElement); // Push the top element back to the stack
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}