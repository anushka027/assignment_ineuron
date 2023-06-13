import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EighthProgram {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectList = new ArrayList<>();
        for (int num : nums2) {
            if (map1.containsKey(num) && map1.get(num) > 0) {
                intersectList.add(num);
                map1.put(num, map1.get(num) - 1);
            }
        }

        int[] result = new int[intersectList.size()];
        int index = 0;
        for (int num : intersectList) {
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

        int[] intersectionArray = intersect(nums1, nums2);
        System.out.println("The intersection of nums1 and nums2 is: " + Arrays.toString(intersectionArray));
    }
}
