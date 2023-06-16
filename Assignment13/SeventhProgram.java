public class SeventhProgram {
    static class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListReverser {
    public static Node reverseDoublyLinkedList(Node head) {
        Node current = head;
        Node prev = null;

        // Traverse the list and swap previous and next pointers
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }

        // Update the head pointer
        head = prev;

        return head;
    }

    // Function to display the doubly linked list
    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        // Reverse the doubly linked list
        head = reverseDoublyLinkedList(head);

        // Display the reversed doubly linked list: 5 <-> 4 <-> 3 <-> 2 <-> 1
        displayList(head);
    }
}

}
