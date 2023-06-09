import java.util.Scanner;

public class FourthProgram {
    public static double calculateExponent(double base, int power) {
        return Math.pow(base, power);
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Calculate the exponent
        double exponent = calculateExponent(number, power);

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + exponent);
    }
}
