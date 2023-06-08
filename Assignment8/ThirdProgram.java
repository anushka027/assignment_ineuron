import java.util.*;
public class ThirdProgram {
    public static int minSteps(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D array to store the LCS lengths
        int[][] dp = new int[m + 1][n + 1];

        // Calculate the LCS lengths
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Calculate the minimum number of steps
        int lcsLength = dp[m][n];
        int steps = m + n - 2 * lcsLength;

        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter word2: ");
        String word2 = scanner.nextLine();

        int minSteps = minSteps(word1, word2);
        System.out.println("Minimum number of steps required: " + minSteps);
    }
}
