public class SecondProgram {
    public static void sortColors(int[] nums) {
        int low = 0;        // Pointer for the partition of red (0)
        int mid = 0;        // Pointer for the partition of white (1)
        int high = nums.length - 1;   // Pointer for the partition of blue (2)

        while (mid <= high) {
            if (nums[mid] == 0) {
                // If the current element is red (0), swap it with the element at the low pointer
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If the current element is white (1), move the mid pointer to the next element
                mid++;
            } else if (nums[mid] == 2) {
                // If the current element is blue (2), swap it with the element at the high pointer
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}