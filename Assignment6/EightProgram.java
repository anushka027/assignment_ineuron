import java.util.Scanner;

public class EightProgram {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = 0; x < k; x++) {
                    result[i][j] += mat1[i][x] * mat2[x][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m) of mat1: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (k) of mat1: ");
        int k = scanner.nextInt();

        System.out.print("Enter the number of columns (n) of mat2: ");
        int n = scanner.nextInt();

        int[][] mat1 = new int[m][k];
        int[][] mat2 = new int[k][n];

        System.out.println("Enter the elements of mat1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of mat2:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiply(mat1, mat2);

        System.out.println("Result of mat1 x mat2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
