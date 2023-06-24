 import java.util.*;

public class SeventhProgram {
   
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        // Add elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for intersection with elements of nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionArray[index] = num;
            index++;
        }

        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2, 3};

        int[] intersectionArray = intersection(nums1, nums2);

        System.out.println("Intersection Array:");
        printArray(intersectionArray);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

