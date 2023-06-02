import java.util.Scanner;

public class SixthProgram {
    public static int findSingleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int singleNumber = findSingleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}
