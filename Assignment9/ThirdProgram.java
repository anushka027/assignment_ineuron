import java.util.Scanner;

public class ThirdProgram {
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Recursive case: calculate factorial using recursion
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        int factorial = calculateFactorial(number);

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
