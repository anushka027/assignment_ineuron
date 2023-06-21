import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class SixthProgram {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 3;

        reverseKElements(queue, k);
        System.out.println("Reversed Queue: " + queue);
    }

    public static void reverseKElements(Queue<Integer> queue, int k) {
        if (k <= 0 || k > queue.size()) {
            throw new IllegalArgumentException("Invalid value of k.");
        }

        Stack<Integer> stack = new Stack<>();

        // Push the first k elements onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Enqueue the remaining elements back into the queue
        while (!queue.isEmpty()) {
            queue.add(queue.remove());
        }

        // Enqueue the elements from the stack back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}