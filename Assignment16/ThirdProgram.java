import java.util.Stack;
public class ThirdProgram {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(2);

        deleteMiddleElement(stack);
        System.out.println("Stack after deleting middle element: " + stack);
    }

    public static void deleteMiddleElement(Stack<Integer> stack) {
        int size = stack.size();
        int middleIndex = size / 2 + 1;

        Stack<Integer> tempStack = new Stack<>();

        // Pop elements until reaching the middle index
        for (int i = 1; i < middleIndex; i++) {
            tempStack.push(stack.pop());
        }

        // Pop the middle element
        stack.pop();

        // Pop remaining elements from temporary stack and push them back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}