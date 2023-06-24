public class ThirdProgram {

    public void sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
    }

    private void mergeSort(int[] nums, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, temp, start, mid);
        mergeSort(nums, temp, mid + 1, end);
        merge(nums, temp, start, mid, end);
    }

    private void merge(int[] nums, int[] temp, int start, int mid, int end) {
        int leftIndex = start;
        int rightIndex = mid + 1;
        int mergeIndex = start;

        while (leftIndex <= mid && rightIndex <= end) {
            if (nums[leftIndex] <= nums[rightIndex]) {
                temp[mergeIndex] = nums[leftIndex];
                leftIndex++;
            } else {
                temp[mergeIndex] = nums[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }

        while (leftIndex <= mid) {
            temp[mergeIndex] = nums[leftIndex];
            leftIndex++;
            mergeIndex++;
        }

        while (rightIndex <= end) {
            temp[mergeIndex] = nums[rightIndex];
            rightIndex++;
            mergeIndex++;
        }

        // Copy elements from temp back to nums
        System.arraycopy(temp, start, nums, start, end - start + 1);
    }

    public static void main(String[] args) {
       ThirdProgram sorter = new ThirdProgram();
        int[] nums = {5, 2, 6, 1, 9};
        sorter.sortArray(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}