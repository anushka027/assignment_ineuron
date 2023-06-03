import java.util.Arrays;
import java.util.Scanner;

public class EighthProgram {
    public static int[] shuffleArray(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];           // Place xi at even indices
            result[2 * i + 1] = nums[n + i];   // Place yi at odd indices
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter the elements of the array in the form [x1,x2,...,xn,y1,y2,...,yn]:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] shuffledArray = shuffleArray(nums, n);

        System.out.println("Shuffled array: " + Arrays.toString(shuffledArray));
    }
}
