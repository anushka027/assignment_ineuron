import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class FirstProgram {
    
    public static int[][] mergeIntervals(int[][] intervals) {
        // Step 1: Sort intervals based on starting points
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Step 2: Create a list to store merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();

        // Step 3: Iterate through the sorted intervals
        for (int[] interval : intervals) {
            // Step 4: Check if interval overlaps with the last merged interval
            if (mergedIntervals.isEmpty() || mergedIntervals.get(mergedIntervals.size() - 1)[1] < interval[0]) {
                // If it doesn't overlap, add the interval to the result list
                mergedIntervals.add(interval);
            } else {
                // If it overlaps, merge the intervals by updating the end point of the last merged interval
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(
                        mergedIntervals.get(mergedIntervals.size() - 1)[1], interval[1]);
            }
        }

        // Step 5: Convert the result list to an array and return it
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = mergeIntervals(intervals);

        // Print the merged intervals
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}