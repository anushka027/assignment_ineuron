import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstProgram {
    public static int[] reconstructPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        List<Integer> remaining = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            remaining.add(i);
        }

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'I') {
                perm[i] = remaining.remove(0);
            } else {
                perm[i] = remaining.remove(remaining.size() - 1);
            }
        }

        perm[n] = remaining.get(0);

        return perm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string representation of the permutation: ");
        String s = scanner.nextLine();

        int[] perm = reconstructPermutation(s);

        System.out.println("Reconstructed permutation: " + Arrays.toString(perm));

        scanner.close();
    }
}
