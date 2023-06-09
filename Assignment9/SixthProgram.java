import java.util.Scanner;

public class SixthProgram {
    public static int findNthTerm(int a, int d, int N) {
        int nthTerm = a + (N - 1) * d;
        return nthTerm;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        int firstTerm = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int commonDifference = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Find the Nth term of the Arithmetic Progression series
        int nthTerm = findNthTerm(firstTerm, commonDifference, N);

        // Print the result
        System.out.println("The " + N + "th term of the Arithmetic Progression series is: " + nthTerm);
    }
}
