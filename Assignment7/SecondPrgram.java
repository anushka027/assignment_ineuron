import java.util.HashMap;
import java.util.Scanner;

public class SecondPrgram {
    public static boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar)
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        if (isStrobogrammatic(num))
            System.out.println("The number is strobogrammatic.");
        else
            System.out.println("The number is not strobogrammatic.");

        scanner.close();
    }
}
