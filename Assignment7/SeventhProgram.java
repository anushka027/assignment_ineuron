import java.util.Scanner;

public class SeventhProgram {
    public static boolean backspaceCompare(String s, String t) {
        String processedS = processBackspaces(s);
        String processedT = processBackspaces(t);

        return processedS.equals(processedT);
    }

    private static String processBackspaces(String str) {
        StringBuilder processed = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                processed.append(ch);
            } else if (processed.length() > 0) {
                processed.deleteCharAt(processed.length() - 1);
            }
        }

        return processed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        if (backspaceCompare(s, t)) {
            System.out.println("The strings are equal after typing into empty text editors.");
        } else {
            System.out.println("The strings are not equal after typing into empty text editors.");
        }

        scanner.close();
    }
}
