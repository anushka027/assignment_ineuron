import java.util.Scanner;

public class SecondProgram {
    public static int calculateSum(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of the first natural numbers
        int sum = calculateSum(number);

        // Print the result
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
    }
}
