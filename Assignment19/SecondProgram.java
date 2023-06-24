import java.util.ArrayList;
import java.util.List;

public class SecondProgram {

    public List<Integer> countSmaller(int[] nums) {
        int[] counts = new int[nums.length];
        int[] indices = new int[nums.length];
        int[] temp = new int[nums.length];
        int[] tempIndices = new int[nums.length];

        // Initialize indices array
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        mergeSort(nums, indices, counts, temp, tempIndices, 0, nums.length - 1);

        // Convert the counts array to a list
        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }

        return result;
    }

    private void mergeSort(int[] nums, int[] indices, int[] counts, int[] temp, int[] tempIndices, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, indices, counts, temp, tempIndices, start, mid);
        mergeSort(nums, indices, counts, temp, tempIndices, mid + 1, end);
        merge(nums, indices, counts, temp, tempIndices, start, mid, end);
    }

    private void merge(int[] nums, int[] indices, int[] counts, int[] temp, int[] tempIndices, int start, int mid, int end) {
        int leftIndex = start;
        int rightIndex = mid + 1;
        int mergeIndex = start;
        int smallerCount = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (nums[indices[rightIndex]] < nums[indices[leftIndex]]) {
                temp[mergeIndex] = indices[rightIndex];
                smallerCount++;
                rightIndex++;
            } else {
                temp[mergeIndex] = indices[leftIndex];
                counts[indices[leftIndex]] += smallerCount;
                leftIndex++;
            }
            mergeIndex++;
        }

        while (leftIndex <= mid) {
            temp[mergeIndex] = indices[leftIndex];
            counts[indices[leftIndex]] += smallerCount;
            leftIndex++;
            mergeIndex++;
        }

        while (rightIndex <= end) {
            temp[mergeIndex] = indices[rightIndex];
            rightIndex++;
            mergeIndex++;
        }

        System.arraycopy(temp, start, indices, start, end - start + 1);
    }

    public static void main(String[] args) {
        SecondProgram counter = new SecondProgram();
        int[] nums = {5, 2, 6, 1};
        List<Integer> result = counter.countSmaller(nums);
        System.out.println(result);
    }
}
