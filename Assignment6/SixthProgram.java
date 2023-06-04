import java.util.*;
public class SixthProgram {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;

        if (n % 2 != 0) {
            return new int[0]; 
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed); 
        int[] original = new int[n / 2];
        int index = 0;

        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                continue;
            }

            int doubledNum = num * 2;

            if (countMap.getOrDefault(doubledNum, 0) == 0) {
                return new int[0]; 
            }

            original[index] = num;
            index++;

            countMap.put(num, countMap.get(num) - 1);
            countMap.put(doubledNum, countMap.get(doubledNum) - 1);
        }

        return original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the changed array: ");
        int length = scanner.nextInt();

        int[] changed = new int[length];
        System.out.println("Enter the elements of the changed array (separated by spaces):");
        for (int i = 0; i < length; i++) {
            changed[i] = scanner.nextInt();
        }

        int[] original = findOriginalArray(changed);

        if (original.length == 0) {
            System.out.println("The changed array is not a valid doubled array.");
        } else {
            System.out.println("Original array: " + Arrays.toString(original));
        }

        scanner.close();
    }
}
