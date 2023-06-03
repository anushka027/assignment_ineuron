import java.util.Scanner;

public class SeventhProgram {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n; // If no operations are given, the maximum count is m * n
        }

        int minRow = m;
        int minCol = n;

        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        return minRow * minCol;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of operations: ");
        int numOps = scanner.nextInt();

        int[][] ops = new int[numOps][2];

        System.out.println("Enter the operations in the format [ai, bi]:");
        for (int i = 0; i < numOps; i++) {
            System.out.print("Operation " + (i + 1) + ": ");
            ops[i][0] = scanner.nextInt();
            ops[i][1] = scanner.nextInt();
        }

        int maxIntegers = maxCount(m, n, ops);

        System.out.println("Number of maximum integers in the matrix: " + maxIntegers);
    }
}
