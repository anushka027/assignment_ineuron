import java.util.HashMap;
import java.util.Scanner;

public class FirstProgram {
    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> charMap = new HashMap<>();
        HashMap<Character, Boolean> mappedChars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (charMap.containsKey(charS)) {
                if (charMap.get(charS) != charT)
                    return false;
            } else {
                if (mappedChars.containsKey(charT))
                    return false;

                charMap.put(charS, charT);
                mappedChars.put(charT, true);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        if (areIsomorphic(s, t))
            System.out.println("The strings are isomorphic.");
        else
            System.out.println("The strings are not isomorphic.");

        scanner.close();
    }
}
