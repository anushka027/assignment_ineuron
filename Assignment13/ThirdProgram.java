public class ThirdProgram {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReverser {
    public static Node reverseKNodes(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        // Reverse the links of k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // If there are remaining nodes, recursively reverse them
        if (next != null) {
            head.next = reverseKNodes(next, k);
        }

        // Set head as the new head of the reversed linked list
        return prev;
    }

    // Function to display the linked list
    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        int k = 3; // Value of k

        // Reverse every k nodes in the linked list
        head = reverseKNodes(head, k);

        // Display the modified linked list: 3 -> 2 -> 1 -> 6 -> 5 -> 4 -> 9 -> 8 -> 7
        displayList(head);
    }
}
}
