import java.util.Scanner;

public class FirstProgram {
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0]; 
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the original array: ");
        int length = scanner.nextInt();

        int[] original = new int[length];
        System.out.println("Enter the elements of the original array (separated by spaces): ");
        for (int i = 0; i < length; i++) {
            original[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int[][] result = convertTo2DArray(original, m, n);

        
        System.out.println("Resulting 2D Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
