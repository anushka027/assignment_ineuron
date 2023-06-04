import java.util.Scanner;

public class SecondProgram {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / n][mid % n];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        boolean found = searchMatrix(matrix, target);

        System.out.println("Target found: " + found);

        scanner.close();
    }
}
