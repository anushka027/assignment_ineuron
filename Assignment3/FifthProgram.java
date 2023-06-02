import java.util.Arrays;

public class FifthProgram {
    public static int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;

            if (sum < 10) {
                digits[i] = sum;
                carry = 0;
                break;
            } else {
                digits[i] = sum % 10;
            }
        }

        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        System.out.println("Original array: " + Arrays.toString(digits));
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
