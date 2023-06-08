import java.util.*;
public class EighthProrgam {
    public static boolean isPossibleToSwap(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int diffCount = 0;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffCount++;

                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                }
            }
        }

        return diffCount == 2 && s.charAt(firstIndex) == goal.charAt(secondIndex) &&
                s.charAt(secondIndex) == goal.charAt(firstIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter string goal: ");
        String goal = scanner.nextLine();

        boolean isPossible = isPossibleToSwap(s, goal);
        System.out.println("Is it possible to swap two letters to obtain goal? " + isPossible);
    }
}
