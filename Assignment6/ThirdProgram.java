import java.util.Scanner;

public class ThirdProgram {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the elements of the array (separated by spaces):");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isValidMountain = validMountainArray(arr);

        System.out.println("Is the array a valid mountain array? " + isValidMountain);

        scanner.close();
    }
}
