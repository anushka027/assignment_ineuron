import java.util.Arrays;
import java.util.Scanner;

public class SeventhProgram {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = findLeftPosition(nums, target);
        
        if (left == -1) {
            return result;
        }
        
        int right = findRightPosition(nums, target);
        
        result[0] = left;
        result[1] = right;
        return result;
    }
    
    private static int findLeftPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    position = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        
        return position;
    }
    
    private static int findRightPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    position = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        
        return position;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array in non-decreasing order:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        scanner.close();

        int[] range = searchRange(nums, target);
        System.out.println("The starting and ending positions of target in the array are: " + Arrays.toString(range));
    }
}    