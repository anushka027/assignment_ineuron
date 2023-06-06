import java.util.Scanner;

public class SixthProgram {
    public static boolean canShiftToGoal(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int n = s.length();
        String doubleS = s + s; // Concatenate s with itself to handle circular shifts

        for (int i = 0; i < n; i++) {
            String shifted = doubleS.substring(i, i + n);
            if (shifted.equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String goal = scanner.nextLine();

        if (canShiftToGoal(s, goal)) {
            System.out.println("The first string can be transformed into the second string after some shifts.");
        } else {
            System.out.println("The first string cannot be transformed into the second string after any number of shifts.");
        }

        scanner.close();
    }
}
