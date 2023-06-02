import java.util.Arrays;
import java.util.Scanner;

public class FirstProgram {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return target; 
                }

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; 
                }

                if (sum < target) {
                    left++;
                } else {
                    right--; 
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int closestSum = threeSumClosest(nums, target);
        System.out.println("Closest sum: " + closestSum);
    }
}
