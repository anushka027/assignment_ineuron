import java.util.*;
public class FourthProgram {
    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if (countMap.containsKey(count)) {
                maxLength = Math.max(maxLength, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the binary array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the binary array (0 or 1, separated by spaces):");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxLength = findMaxLength(nums);

        System.out.println("Maximum length of a contiguous subarray with equal number of 0 and 1: " + maxLength);

        scanner.close();
    }
}
