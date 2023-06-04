import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EighthProgram {
    public static int[] recoverOriginalArray(int[] changed) {
        int n = changed.length;

        if (n % 2 != 0) {
            // If the length of changed is odd, it cannot be a doubled array
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();

        Arrays.sort(changed);

        for (int num : changed) {
            if (countMap.containsKey(num) && countMap.containsKey(2 * num)) {
                int count = countMap.get(num);
                int doubleCount = countMap.get(2 * num);

                if (count > 0 && doubleCount > 0) {
                    originalList.add(num);

                    countMap.put(num, count - 1);
                    countMap.put(2 * num, doubleCount - 1);
                }
            }
        }

        if (originalList.size() == n / 2) {
            int[] original = new int[originalList.size()];

            for (int i = 0; i < originalList.size(); i++) {
                original[i] = originalList.get(i);
            }

            return original;
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] changed = new int[length];
        System.out.println("Enter the elements of the array (separated by spaces):");
        for (int i = 0; i < length; i++) {
            changed[i] = scanner.nextInt();
        }

        int[] original = recoverOriginalArray(changed);

        System.out.println("Original array: " + Arrays.toString(original));

        scanner.close();
    }
}
