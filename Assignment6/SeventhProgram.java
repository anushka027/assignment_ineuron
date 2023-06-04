import java.util.Scanner;

public class SeventhProgram {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        int num = 1;

        while (num <= n * n) {
            
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = num++;
            }
            rowStart++;

            
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = num++;
            }
            colEnd--;

            
            for (int col = colEnd; col >= colStart; col--) {
                matrix[rowEnd][col] = num++;
            }
            rowEnd--;

            
            for (int row = rowEnd; row >= rowStart; row--) {
                matrix[row][colStart] = num++;
            }
            colStart++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[][] matrix = generateMatrix(n);

        System.out.println("Generated Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
