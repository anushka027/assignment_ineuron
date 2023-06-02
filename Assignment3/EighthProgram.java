import java.util.Arrays;
import java.util.Scanner;

public class EighthProgram {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of meetings: ");
        int n = scanner.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter the start and end times of the meetings:");
        for (int i = 0; i < n; i++) {
            System.out.print("Meeting " + (i + 1) + ": ");
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        boolean canAttend = canAttendMeetings(intervals);
        System.out.println("Can attend all meetings? " + canAttend);
    }
}
