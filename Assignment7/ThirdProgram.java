import java.util.Scanner;

public class ThirdProgram {
    public static String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;

            int total = digit1 + digit2 + carry;
            int digitSum = total % 10;
            carry = total / 10;

            sum.insert(0, digitSum);
        }

        return sum.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();

        String result = addStrings(num1, num2);
        System.out.println("The sum is: " + result);

        scanner.close();
    }
}
