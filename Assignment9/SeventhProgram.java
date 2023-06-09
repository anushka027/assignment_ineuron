import java.util.Scanner;

public class SeventhProgram {
    public static void generatePermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                generatePermutations(str, start + 1, end);
                str = swap(str, start, i); // Backtrack
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Generate and print all permutations
        generatePermutations(inputString, 0, inputString.length() - 1);
    }
}
