import java.util.*;
public class SecondProgram {
    public static int[] findNearestSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array from left to right
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack greater than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // Set the result element for index i
            if (stack.isEmpty()) {
                result[i] = -1; // No smaller element on the left
            } else {
                result[i] = stack.peek(); // Nearest smaller element on the left
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] result = findNearestSmaller(arr);

        // Print the result
        System.out.println("Nearest smaller elements on the left:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }

    public void push(int i) {
    }

    public char[] pop() {
        return null;
    }

    public char[] top() {
        return null;
    }

    public char[] isEmpty() {
        return null;
    }
}