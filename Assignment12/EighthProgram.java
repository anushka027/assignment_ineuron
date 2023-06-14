
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
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

    boolean isCircular() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slowPtr = head;
        Node fastPtr = head.next;

        while (fastPtr != null && fastPtr.next != null) {
            if (slowPtr == fastPtr) {
                return true;
            }

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Take input from the user for the linked list elements
        // ...

        // Create a circular linked list (optional)
        // ...

        boolean isCircular = linkedList.isCircular();

        if (isCircular) {
            System.out.println("The linked list is circular.");
        } else {
            System.out.println("The linked list is not circular.");
        }
    }
}
