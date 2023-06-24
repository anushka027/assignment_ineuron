import java.util.Arrays;
public class FourthProgram {
    public static int maximumGap(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return 0;   // Return 0 if the array contains less than two elements
        }

        // Find the maximum element in the array
        int maxNum = Arrays.stream(nums).max().getAsInt();

        int exp = 1;   // Current digit position

        int[] sorted = new int[n];   // Array to store sorted elements

        // Perform radix sort until all digits are sorted
        while (maxNum / exp > 0) {
            int[] count = new int[10];   // Count array to store the occurrence of each digit

            // Count the occurrence of each digit
            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / exp) % 10;
                count[digit]++;
            }

            // Calculate the cumulative count
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the sorted array based on the current digit
            for (int i = n - 1; i >= 0; i--) {
                int digit = (nums[i] / exp) % 10;
                sorted[count[digit] - 1] = nums[i];
                count[digit]--;
            }

            // Copy the sorted array back to the original array
            System.arraycopy(sorted, 0, nums, 0, n);

            exp *= 10;   // Move to the next digit position
        }

        // Calculate the maximum difference between successive elements
        int maxDiff = 0;
        for (int i = 1; i < n; i++) {
            maxDiff = Math.max(maxDiff, nums[i] - nums[i - 1]);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        int maxDifference = maximumGap(nums);

        System.out.println("Maximum difference: " + maxDifference);
    }
}
