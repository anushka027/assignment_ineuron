import java.util.LinkedList;
import java.util.Queue;
public class ThirdProgram {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public ThirdProgram() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int value) {
        // Add the new element to the main queue
        q1.offer(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Get the last element from q1
        int element = q1.poll();

        // Swap q1 and q2 references
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return element;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Get the last element from q1
        int element = q1.peek();

        // Move the element to q2
        q2.offer(q1.poll());

        // Swap q1 and q2 references
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return element;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        SecondProgram stack = new SecondProgram();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.top()); // Output: 2
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.pop()); // Output: 1
        System.out.println(stack.isEmpty()); // Output: true
    }
}