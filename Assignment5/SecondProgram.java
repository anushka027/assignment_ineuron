import java.util.Scanner;

public class SecondProgram {
    public static int countCompleteRows(int n) {
        // Find the maximum number of complete rows that can be formed
        int completeRows = 0;
        while (n >= completeRows + 1) {
            n -= completeRows + 1;
            completeRows++;
        }
        return completeRows;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of coins: ");
        int n = scanner.nextInt();

        int completeRows = countCompleteRows(n);

        System.out.println("Number of complete rows: " + completeRows);

        scanner.close();
    }
}
