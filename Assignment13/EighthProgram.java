public class EighthProgram {
    static class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

static class DoublyLinkedList {
    Node head;

    public void deleteNode(int position) {
        // Case 1: Empty list
        if (head == null)
            return;

        // Case 2: Delete head node
        if (position == 0) {
            Node nextNode = head.next;
            if (nextNode != null)
                nextNode.prev = null;
            head.next = null;
            head = nextNode;
            return;
        }

        // Case 3: Traverse to the position
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == null)
                return;
        }

        // Case 4: Invalid position
        if (current == null || current.next == null)
            return;

        // Update the links
        Node nextNode = current.next.next;
        if (nextNode != null)
            nextNode.prev = current;
        current.next = nextNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding nodes to the list
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        list.head.next = second;
        second.prev = list.head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        // Displaying the initial list
        System.out.print("Initial list: ");
        list.display();

        // Deleting node at position 2
        int position = 2;
        list.deleteNode(position);

        // Displaying the modified list
        System.out.print("List after deleting node at position " + position + ": ");
        list.display();
    }
}
}
