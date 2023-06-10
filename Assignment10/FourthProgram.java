import java.util.Scanner;

public class FourthProgram {
    
    public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        
        // Remove the first character from the string and recursively calculate the length of the remaining substring
        return 1 + calculateLength(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = calculateLength(str);
        System.out.println("Length of the string: " + length);
    }
}

