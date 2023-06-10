import java.util.Scanner;

public class ThirdProgram {

    public static void generateSubsets(String set, int index, String currentSubset) {
        if (index == set.length()) {
            System.out.println(currentSubset);
            return;
        }

        // Exclude the current element
        generateSubsets(set, index + 1, currentSubset);

        // Include the current element
        generateSubsets(set, index + 1, currentSubset + set.charAt(index));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the set represented as a string: ");
        String set = scanner.nextLine();

        generateSubsets(set, 0, "");
    }
}

