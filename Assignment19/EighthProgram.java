import java.util.*;

public class EighthProgram {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Create frequency map for nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();

        // Check for intersection with nums2 and update intersection list
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersectionList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert the intersection list to an array
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2, 3};

        int[] intersectionArray = intersect(nums1, nums2);

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