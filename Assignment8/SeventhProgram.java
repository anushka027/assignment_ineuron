import java.util.*;

public class SeventhProgram {
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                // Find the number
                int numStart = index;
                while (Character.isDigit(s.charAt(index + 1))) {
                    index++;
                }
                int num = Integer.parseInt(s.substring(numStart, index + 1));

                // Find the corresponding closing bracket
                int count = 1;
                int bracketStart = index + 2;
                index = bracketStart;
                while (count > 0) {
                    if (s.charAt(index) == '[') {
                        count++;
                    } else if (s.charAt(index) == ']') {
                        count--;
                    }
                    index++;
                }

                // Recursive call to decode the substring inside the brackets
                String decodedSubstring = decodeString(s.substring(bracketStart, index - 1));

                // Append the decoded substring k times to the result
                for (int i = 0; i < num; i++) {
                    result.append(decodedSubstring);
                }
            } else {
                // Append non-digit characters to the result
                result.append(s.charAt(index));
            }

            index++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the encoded string: ");
        String s = scanner.nextLine();

        String decodedString = decodeString(s);
        System.out.println("Decoded string: " + decodedString);
    }
}
