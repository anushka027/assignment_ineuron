public class SecondProgram {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDuplicatesRemover {
    public static void removeDuplicates(Node head) {
        if (head == null)
            return;

        Node current = head;

        while (current != null && current.next != null) {
            // Compare the current node with its next node
            if (current.data == current.next.data) {
                // Duplicate found, skip the next node
                current.next = current.next.next;
            } else {
                // No duplicate found, move to the next node
                current = current.next;
            }
        }
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
        // Create the linked list: 11 -> 11 -> 11 -> 21 -> 43 -> 43 -> 60 -> null
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(43);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(60);

        // Remove duplicate nodes from the linked list
        removeDuplicates(head);

        // Display the modified linked list: 11 -> 21 -> 43 -> 60
        displayList(head);
    }
}

}
