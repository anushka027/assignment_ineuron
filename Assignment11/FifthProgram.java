import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FifthProgram {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in nums1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the elements of nums1: ");
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in nums2: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter the elements of nums2: ");
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }
        scanner.close();

        int[] intersectionArray = intersection(nums1, nums2);
        System.out.println("The intersection of nums1 and nums2 is: " + Arrays.toString(intersectionArray));
    }
}
