import java.util.Scanner;

public class FifthProgram {
    public static int arrangeCoins(int n) {
        int count = 0;
        int row = 1;

        while (n >= row) {
            n -= row;
            row++;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of coins: ");
        int n = scanner.nextInt();

        int completeRows = arrangeCoins(n);

        System.out.println("Number of complete rows in the staircase: " + completeRows);
    }
}
