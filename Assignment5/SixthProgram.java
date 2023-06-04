import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SixthProgram {
    
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(num));
            } else {
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array (separated by spaces):");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        List<Integer> duplicates = findDuplicates(nums);

        System.out.println("Integers that appear twice: " + duplicates);

        scanner.close();
    }
}
