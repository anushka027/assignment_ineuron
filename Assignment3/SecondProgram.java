import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondProgram {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1])
                continue;

            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1])
                    continue;

                int left = b + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[a] + nums[b] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        List<List<Integer>> quadruplets = fourSum(nums, target);

        System.out.println("Unique Quadruplets:");
        for (List<Integer> quadruplet : quadruplets) {
            System.out.println(quadruplet);
        }
    }
}







