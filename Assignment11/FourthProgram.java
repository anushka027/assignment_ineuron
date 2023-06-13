import java.util.Scanner;

public class FourthProgram {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Detect the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find the entry point of the cycle
        int ptr1 = nums[0];
        int ptr2 = slow;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n + 1];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i <= n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        int repeatedNumber = findDuplicate(nums);
        System.out.println("The repeated number is: " + repeatedNumber);
    }
}
