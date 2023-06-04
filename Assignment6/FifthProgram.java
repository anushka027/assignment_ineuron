import java.util.Arrays;
import java.util.Scanner;

public class FifthProgram {
    
    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums1[i] * nums2[n - 1 - i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the arrays: ");
        int length = scanner.nextInt();

        int[] nums1 = new int[length];
        int[] nums2 = new int[length];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < length; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < length; i++) {
            nums2[i] = scanner.nextInt();
        }

        int minProduct = minProductSum(nums1, nums2);

        System.out.println("Minimum product sum: " + minProduct);

        scanner.close();
    }
}
