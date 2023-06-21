import java.util.*;
public class FirstProgram {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 4, 4, 5};

        int[] result = findNearestElements(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findNearestElements(int[] array) {
        int[] result = new int[array.length];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Calculate frequencies of elements
        for (int i = array.length - 1; i >= 0; i--) {
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
        }

        // Find nearest element with greater frequency
        for (int i = array.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && frequencyMap.get(array[i]) >= frequencyMap.get(stack.peek())) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(array[i]);
        }

        return result;
    }
}
