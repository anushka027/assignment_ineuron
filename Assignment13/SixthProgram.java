public class SixthProgram {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMerger {
    public static Node mergeSortedLists(Node head1, Node head2) {
        Node dummyHead = new Node(0); // Dummy node
        Node current = dummyHead;
        Node ptr1 = head1;
        Node ptr2 = head2;

        // Traverse both lists simultaneously
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.data <= ptr2.data) {
                current.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                current.next = ptr2;
                ptr2 = ptr2.next;
            }
            current = current.next;
        }

        // Append remaining nodes, if any
        if (ptr1 != null) {
            current.next = ptr1;
        }
        if (ptr2 != null) {
            current.next = ptr2;
        }

        return dummyHead.next;
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
        // Create the first sorted linked list: 1 -> 3 -> 5 -> null
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // Create the second sorted linked list: 2 -> 4 -> 6 -> null
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        // Merge the two sorted linked lists
        Node mergedHead = mergeSortedLists(head1, head2);

        // Display the merged linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        displayList(mergedHead);
    }
}
}