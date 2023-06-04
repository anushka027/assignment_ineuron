import java.util.Scanner;

public class SeventhProgram {
    public static int findMinimum(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum element is in the right half
                left = mid + 1;
            } else {
                // Minimum element is in the left half or mid itself
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array in ascending order (separated by spaces):");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int minimum = findMinimum(nums);

        System.out.println("Minimum element: " + minimum);

        scanner.close();
    }
}
