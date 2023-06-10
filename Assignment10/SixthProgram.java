import java.util.Scanner;

public class SixthProgram {
    
    public static void moveDiscs(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        moveDiscs(n - 1, source, destination, auxiliary);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        moveDiscs(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of discs: ");
        int n = scanner.nextInt();

        int totalMoves = (int) Math.pow(2, n) - 1;

        System.out.println("Steps to solve the Tower of Hanoi puzzle with " + n + " discs:");
        moveDiscs(n, 'A', 'B', 'C');

        System.out.println("Total moves required: " + totalMoves);
    }
}
