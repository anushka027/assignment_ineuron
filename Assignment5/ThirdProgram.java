import java.util.Arrays;
import java.util.Scanner;

public class ThirdProgram {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array in non-decreasing order:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] squaredArray = sortedSquares(nums);

        System.out.println("Sorted Squares: " + Arrays.toString(squaredArray));

        scanner.close();
    }
}
