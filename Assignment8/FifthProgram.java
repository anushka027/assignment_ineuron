import java.util.*;
public class FifthProgram {
    public static int compress(char[] chars) {
        int n = chars.length; // Length of the original array
        int i = 0; // Pointer for the current position in the array
        int j = 0; // Pointer for the position to write the compressed characters

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // Count the consecutive repeating characters
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the compressed character
            chars[j++] = currentChar;

            // Write the count if it is greater than 1
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[j++] = c;
                }
            }
        }

        return j; // Return the new length of the compressed array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        char[] chars = new char[length];

        System.out.println("Enter the characters of the array:");
        for (int i = 0; i < length; i++) {
            chars[i] = scanner.next().charAt(0);
        }

        int newLength = compress(chars);
        System.out.println("New length of the compressed array: " + newLength);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
