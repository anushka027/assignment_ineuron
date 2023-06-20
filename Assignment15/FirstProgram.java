import java.util.*;
public class FirstProgram {
    public static int[] findNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize all elements with -1
        Arrays.fill(result, -1);

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = arr[stack.peek()];
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25, 7, 8, 6, 10 };
        int[] result = findNextGreaterElement(arr);

        // Print the result
        System.out.println("Next greater elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}