import java.util.Scanner;

public class SixthProgram {
    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n]; 

        System.out.println("Enter the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int mid = 0; 
        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("The target is at index " + mid);
                break;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (left > right) {
            System.out.println("The target element is not present in the array.");
        }
    }
}