import java.util.Scanner;

public class EighthProgram {
    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();

        int[][] coordinates = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x-coordinate of point " + (i + 1) + ": ");
            coordinates[i][0] = scanner.nextInt();
            System.out.print("Enter y-coordinate of point " + (i + 1) + ": ");
            coordinates[i][1] = scanner.nextInt();
        }

        if (checkStraightLine(coordinates)) {
            System.out.println("The points form a straight line in the XY plane.");
        } else {
            System.out.println("The points do not form a straight line in the XY plane.");
        }

        scanner.close();
    }
}
