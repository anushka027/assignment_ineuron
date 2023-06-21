import java.util.Stack;
public class EighthProgram {
    public static void main(String[] args) {
        int[] array = {2, 1, 8, 6, 9, 4};

        int maxDiff = findMaxDifference(array);
        System.out.println("Maximum Absolute Difference: " + maxDiff);
    }

    public static int findMaxDifference(int[] array) {
        int n = array.length;
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Calculate nearest smaller element on the left side
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && array[stack.peek()] >= array[i]) {
                stack.pop();
            }

            leftSmaller[i] = stack.isEmpty() ? 0 : array[stack.peek()];
            stack.push(i);
        }

        stack.clear();

        // Calculate nearest smaller element on the right side
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && array[stack.peek()] >= array[i]) {
                stack.pop();
            }

            rightSmaller[i] = stack.isEmpty() ? 0 : array[stack.peek()];
            stack.push(i);
        }

        int maxDiff = 0;

        // Calculate the maximum absolute difference
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(leftSmaller[i] - rightSmaller[i]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }
}