import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
                prevValue = currValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        String romanNumeral = "XXVII";
        int integer = romanToInteger.romanToInt(romanNumeral);
        System.out.println("Roman Numeral: " + romanNumeral);
        System.out.println("Integer: " + integer);
    }
}