import java.util.Scanner;

public class EighthProgram {
    
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isConsonant(ch)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int consonantCount = countConsonants(str);
        System.out.println("Total number of consonants: " + consonantCount);
    }
}