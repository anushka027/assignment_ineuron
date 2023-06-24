import java.util.Stack;

public class EighthProgram {
    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int maxK = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < maxK) {
                return true; // Found a valid 132 pattern
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                maxK = Math.max(maxK, stack.pop()); // Update the maximum value
            }

            stack.push(nums[i]); // Add the element to the stack
        }

        return false; // No 132 pattern found
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        boolean hasPattern = find132pattern(nums);

        System.out.println("Has 132 pattern: " + hasPattern);
    }
}