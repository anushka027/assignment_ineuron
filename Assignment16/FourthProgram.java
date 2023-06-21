import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class FourthProgram {
    public static void main(String[] args) {
        Queue<Integer> originalQueue = new LinkedList<>();
        originalQueue.add(4);
        originalQueue.add(1);
        originalQueue.add(3);
        originalQueue.add(2);
        originalQueue.add(5);

        boolean canArrange = checkQueueOrder(originalQueue);
        System.out.println("Elements can be arranged in increasing order: " + canArrange);
    }

    public static boolean checkQueueOrder(Queue<Integer> originalQueue) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> auxiliaryQueue = new LinkedList<>();

        int expectedElement = 1;

        while (!originalQueue.isEmpty()) {
            if (originalQueue.peek() == expectedElement) {
                auxiliaryQueue.add(originalQueue.poll());
                expectedElement++;
            } else if (!stack.isEmpty() && stack.peek() == expectedElement) {
                auxiliaryQueue.add(stack.pop());
                expectedElement++;
            } else {
                stack.push(originalQueue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == expectedElement) {
                auxiliaryQueue.add(stack.pop());
                expectedElement++;
            } else {
                return false; // Elements cannot be arranged in increasing order
            }
        }

        while (!originalQueue.isEmpty()) {
            if (originalQueue.poll() != expectedElement) {
                return false; // Elements cannot be arranged in increasing order
            }
            auxiliaryQueue.add(expectedElement);
            expectedElement++;
        }

        return auxiliaryQueue.isEmpty();
    }
}