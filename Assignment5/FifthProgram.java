import java.util.Scanner;

public class FifthProgram {
    public static int distanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;

        for (int num1 : arr1) {
            boolean hasCloseElement = false;

            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    hasCloseElement = true;
                    break;
                }
            }

            if (!hasCloseElement) {
                distance++;
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of arr1: ");
        int length1 = scanner.nextInt();

        int[] arr1 = new int[length1];
        System.out.println("Enter the elements of arr1 (separated by spaces):");
        for (int i = 0; i < length1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of arr2: ");
        int length2 = scanner.nextInt();

        int[] arr2 = new int[length2];
        System.out.println("Enter the elements of arr2 (separated by spaces):");
        for (int i = 0; i < length2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of d: ");
        int d = scanner.nextInt();

        int distance = distanceValue(arr1, arr2, d);

        System.out.println("Distance value: " + distance);

        scanner.close();
    }
}
