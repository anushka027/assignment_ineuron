public class FifthProgram {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListLastOccurrenceDeleter {
    public static Node deleteLastOccurrence(Node head, int key) {
        Node prev = null;
        Node current = head;
        Node lastOccurrence = null;

        // Find the last occurrence of the key
        while (current != null) {
            if (current.data == key) {
                lastOccurrence = current;
            }
            prev = current;
            current = current.next;
        }

        // Key not found, return the original linked list
        if (lastOccurrence == null) {
            return head;
        }

        // Delete the last occurrence of the key
        if (lastOccurrence == head) {
            head = head.next;
        } else {
            prev.next = lastOccurrence.next;
        }

        return head;
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
        // Create the linked list: 1 -> 2 -> 3 -> 2 -> 4 -> 5 -> 2 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(2);

        int key = 2; // Key to be deleted

        // Delete the last occurrence of the key from the linked list
        head = deleteLastOccurrence(head, key);

        // Display the modified linked list: 1 -> 2 -> 3 -> 2 -> 4 -> 5 -> null
        displayList(head);
    }
}

}
