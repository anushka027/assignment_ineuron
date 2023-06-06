import java.util.Scanner;

public class FourthProgram {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+"); // Split the string into words using whitespace as the delimiter
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse(); // Reverse the characters of the word

            result.append(reversedWord); // Append the reversed word to the result

            if (i < words.length - 1)
                result.append(" "); // Add whitespace if it's not the last word
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }
}
