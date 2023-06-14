
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head1, head2;

    void insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void mergeAlternate() {
        if (head1 == null || head2 == null) {
            return;
        }

        Node current1 = head1;
        Node current2 = head2;
        Node next1, next2;

        while (current1 != null && current2 != null) {
            // Save the next pointers
            next1 = current1.next;
            next2 = current2.next;

            // Insert current2 after current1
            current1.next = current2;
            current2.next = next1;

            // Move to the next pair of nodes
            current1 = next1;
            current2 = next2;
        }

        // Update the head of the second linked list to null
        head2 = null;
    }

    void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Take input from the user for the first and second linked list elements
        // ...

        linkedList.insert(linkedList.head1, 5);
        linkedList.insert(linkedList.head1, 7);
        linkedList.insert(linkedList.head1, 17);
        linkedList.insert(linkedList.head1, 13);
        linkedList.insert(linkedList.head1, 11);

        linkedList.insert(linkedList.head2, 12);
        linkedList.insert(linkedList.head2, 10);
        linkedList.insert(linkedList.head2, 2);
        linkedList.insert(linkedList.head2, 4);
        linkedList.insert(linkedList.head2, 6);

        System.out.println("First linked list before merging:");
        linkedList.display(linkedList.head1);

        System.out.println("Second linked list before merging:");
        linkedList.display(linkedList.head2);

        linkedList.mergeAlternate();

        System.out.println("First linked list after merging:");
        linkedList.display(linkedList.head1);

        System.out.println("Second linked list after merging:");
        linkedList.display(linkedList.head2);
    }
}
