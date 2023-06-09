import java.util.Scanner;

public class FifthProgram {
    public static int findMax(int[] arr, int start, int end) {
        if (start == end) {
            // Base case: Array has only one element
            return arr[start];
        } else {
            // Recursive case: Divide the array into two halves
            int mid = (start + end) / 2;
            int leftMax = findMax(arr, start, mid);
            int rightMax = findMax(arr, mid + 1, end);

            // Compare the maximum values from the left and right halves
            return Math.max(leftMax, rightMax);
        }
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum element using recursion
        int maxElement = findMax(arr, 0, n - 1);

        // Print the result
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
