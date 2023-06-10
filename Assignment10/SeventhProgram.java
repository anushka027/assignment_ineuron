import java.util.Scanner;

public class SeventhProgram {
    
    public static void printPermutations(String str) {
        printPermutationsHelper(str, "");
    }

    public static void printPermutationsHelper(String str, String perm) {
        if (str.isEmpty()) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            printPermutationsHelper(remainingChars, perm + currentChar);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Permutations of the string:");
        printPermutations(str);
    }
}
