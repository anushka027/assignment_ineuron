import java.util.Stack;
public class FifthProgram {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        String numberString = String.valueOf(number);
        Stack<Character> stack = new Stack<>();

        // Push digits onto the stack
        for (char digit : numberString.toCharArray()) {
            stack.push(digit);
        }

        // Pop digits from the stack and concatenate to form reversed number
        StringBuilder reversedNumberString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedNumberString.append(stack.pop());
        }

        // Convert reversed number back to an integer
        int reversedNumber = Integer.parseInt(reversedNumberString.toString());

        return reversedNumber;
    }
}