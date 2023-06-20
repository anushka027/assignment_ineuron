import java.util.Stack;
public class SeventhProgram {
    private Stack<Integer> stack; // Main stack to store elements
    private Stack<Integer> minStack; // Stack to keep track of minimum elements

    public SeventhProgram() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val); // Push the value onto the main stack

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val); // Push the value onto the minStack if it's empty or <= the current min
        }
    }

    public void pop() {
        int poppedElement = stack.pop(); // Pop the top element from the main stack

        if (poppedElement == minStack.peek()) {
            minStack.pop(); // Pop the top element from the minStack if it's equal to the popped element
        }
    }

    public int top() {
        return stack.peek(); // Return the top element of the main stack
    }

    public int getMin() {
        return minStack.peek(); // Return the top element of the minStack
    }

    public static void main(String[] args) {
        SeventhProgram minStack = new SeventhProgram();
        minStack.push(5);
        minStack.push(2);
        minStack.push(7);

        System.out.println("Top element: " + minStack.top()); // Output: 7
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 2

        minStack.pop();

        System.out.println("Top element after pop: " + minStack.top()); // Output: 2
        System.out.println("Minimum element after pop: " + minStack.getMin()); // Output: 2
    }
}