import java.util.Arrays;
import java.util.Scanner;

public class SixthProgram {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array in non-decreasing order:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] squaredArray = sortedSquares(nums);

        System.out.println("Array of squares in non-decreasing order: " + Arrays.toString(squaredArray));
    }
}
