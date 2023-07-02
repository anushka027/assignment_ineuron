import java.util.*;

class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }

        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from the front of the deque that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements from the back of the deque that are smaller than the current element
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add the current element index to the back of the deque
            deque.offer(i);

            // If the window has reached the required size, store the maximum element
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum solution = new SlidingWindowMaximum();

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxSlidingWindow = solution.maxSlidingWindow(nums, k);
        System.out.println("Max Sliding Window: " + Arrays.toString(maxSlidingWindow));
    }
}