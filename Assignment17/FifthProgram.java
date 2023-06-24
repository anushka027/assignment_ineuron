public class FifthProgram {
    int val;
    FifthProgram next;

    FifthProgram(int val) {
        this.val = val;
    }

public static int findTheWinner(int n, int k) {
    // Create the circular linked list
    FifthProgram head = new FifthProgram(1);
    FifthProgram prev = head;
    for (int i = 2; i <= n; i++) {
       FifthProgram curr = new FifthProgram(i);
        prev.next = curr;
        prev = curr;
    }
    prev.next = head; // Connect the last node to the head to form a circle

    // Eliminate friends until there is only one left
    while (head.next != head) {
        // Move k-1 steps to the right
        for (int i = 0; i < k - 1; i++) {
            head = head.next;
        }
        // Eliminate the friend at the current position
        head.next = head.next.next;
    }

    return head.val;
}
}