import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println("String: " + s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}