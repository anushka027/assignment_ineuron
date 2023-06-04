import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FourthProgram {
    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add all elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();

        // Find distinct integers in nums1 that are not in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinctNums1.add(num);
            }
        }

        // Find distinct integers in nums2 that are not in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinctNums2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinctNums1);
        answer.add(distinctNums2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of nums1: ");
        int length1 = scanner.nextInt();

        int[] nums1 = new int[length1];
        System.out.println("Enter the elements of nums1 (separated by spaces):");
        for (int i = 0; i < length1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of nums2: ");
        int length2 = scanner.nextInt();

        int[] nums2 = new int[length2];
        System.out.println("Enter the elements of nums2 (separated by spaces):");
        for (int i = 0; i < length2; i++) {
            nums2[i] = scanner.nextInt();
        }

        List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);

        System.out.println("Distinct integers in nums1 not present in nums2: " + distinctIntegers.get(0));
        System.out.println("Distinct integers in nums2 not present in nums1: " + distinctIntegers.get(1));

        scanner.close();
    }

}
