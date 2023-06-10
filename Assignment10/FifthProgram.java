import java.util.Scanner;
public class FifthProgram {
    
    public static int countContiguousSubstrings(String str) {
        int count = 0;
        
        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char startChar = str.charAt(i);
            
            // For each character, check if there are any contiguous substrings that start and end with the same character
            for (int j = i; j < str.length(); j++) {
                char endChar = str.charAt(j);
                
                if (startChar == endChar) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int count = countContiguousSubstrings(str);
        System.out.println("Count of contiguous substrings: " + count);
    }
}