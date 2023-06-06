import java.util.Scanner;

public class FifthProgram {
    public static String reverseStringGroups(String s, int k) {
        char[] charArray = s.toCharArray();

        int n = charArray.length;
        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);

            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        String reversedString = reverseStringGroups(s, k);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
