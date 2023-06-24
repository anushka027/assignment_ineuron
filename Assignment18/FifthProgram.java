import java.util.HashSet;
import java.util.Set;

public class FifthProgram {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            }
            set.add(num); // Add the element to the set
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicates = containsDuplicate(nums);

        System.out.println("Has duplicates: " + hasDuplicates);
    }
}