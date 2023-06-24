import java.util.Arrays;
import java.util.Comparator;

public class SixthProgram {
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0; // No balloons, no shots needed
        }

        // Sort the balloons based on their end points
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1; // At least one arrow is needed
        int currentEnd = points[0][1]; // Track the current end point

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currentEnd) {
                // Balloon's start point is greater than the current end point,
                // a new arrow is needed
                arrows++;
                currentEnd = points[i][1]; // Update the current end point
            }
        }

        return arrows;
    }

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int minArrows = findMinArrowShots(points);

        System.out.println("Minimum number of arrows: " + minArrows);
    }
}