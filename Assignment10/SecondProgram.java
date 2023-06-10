import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondProgram {
    
    public static int findLastRemainingNumber(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        boolean isLeftToRight = true;
        while (arr.size() > 1) {
            if (isLeftToRight) {
                for (int i = 0; i < arr.size(); i += 2) {
                    arr.remove(i);
                }
            } else {
                for (int i = arr.size() - 1; i >= 0; i -= 2) {
                    arr.remove(i);
                }
            }

            isLeftToRight = !isLeftToRight;
        }

        return arr.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int lastRemainingNumber = findLastRemainingNumber(n);
        System.out.println("Last remaining number: " + lastRemainingNumber);
    }
}
