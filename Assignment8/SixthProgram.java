import java.util.*;
public class SixthProgram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] targetFreq = new int[26];
        int[] windowFreq = new int[26];

        // Calculate the frequency of characters in string p
        for (char c : p.toCharArray()) {
            targetFreq[c - 'a']++;
        }

        int windowSize = p.length();

        // Initialize the sliding window
        for (int i = 0; i < windowSize; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Check if the current window is an anagram of p
        if (Arrays.equals(targetFreq, windowFreq)) {
            result.add(0);
        }

        // Slide the window over the string s
        for (int i = windowSize; i < s.length(); i++) {
            // Increment the frequency of the new character in the window
            windowFreq[s.charAt(i) - 'a']++;

            // Decrement the frequency of the character leaving the window
            windowFreq[s.charAt(i - windowSize) - 'a']--;

            // Check if the current window is an anagram of p
            if (Arrays.equals(targetFreq, windowFreq)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter string p: ");
        String p = scanner.nextLine();

        List<Integer> indices = findAnagrams(s, p);

        System.out.println("Start indices of p's anagrams in s: " + indices);
    }
}
