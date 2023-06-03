import java.util.Arrays;
import java.util.Scanner;

public class FourthProgram {
    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // Add the minimum value of each pair to the sum
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (2n): ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxSum = arrayPairSum(nums);

        System.out.println("Maximized sum of min(ai, bi): " + maxSum);
    }
}
