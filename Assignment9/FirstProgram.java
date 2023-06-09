import java.util.Scanner;

public class FirstProgram {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is a power of two
        boolean isPower = isPowerOfTwo(number);
        
        // Print the result
        System.out.println(number + " is" + (isPower ? "" : " not") + " a power of two.");
    }
}
