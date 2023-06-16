public class FirstProgram {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMerger {
    public static Node createNewList(Node head1, Node head2) {
        Node newHead = null;
        Node tail = null;

        while (head1 != null && head2 != null) {
            int value1 = head1.data;
            int value2 = head2.data;

            // Compare the values of both nodes
            int greaterValue = Math.max(value1, value2);

            // Create a new node with the greater value
            Node newNode = new Node(greaterValue);

            // If it's the first node, set it as the head of the new linked list
            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                // Otherwise, add the new node to the end of the new linked list
                tail.next = newNode;
                tail = newNode;
            }

            // Move to the next nodes in both original linked lists
            head1 = head1.next;
            head2 = head2.next;
        }

        return newHead;
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
        // Create the first linked list: 1 -> 3 -> 5 -> null
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // Create the second linked list: 2 -> 4 -> 6 -> null
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        // Create the new merged linked list
        Node mergedHead = createNewList(head1, head2);

        // Display the merged linked list: 2 -> 4 -> 6 -> null
        displayList(mergedHead);
    }
}

}
