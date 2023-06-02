import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeventhProgram {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        int prev = lower - 1;

        for (int i = 0; i <= nums.length; i++) {
            int current = (i == nums.length) ? upper + 1 : nums[i];

            if (current - prev >= 2) {
                result.add(formatRange(prev + 1, current - 1));
            }

            prev = current;
        }

        return result;
    }

    public static String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println("Missing ranges:");
        for (String range : missingRanges) {
            System.out.println(range);
        }
    }
}
