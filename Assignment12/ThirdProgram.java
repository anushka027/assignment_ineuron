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

    Node findNthNodeFromEnd(int N) {
        if (head == null || N <= 0) {
            return null;
        }

        Node mainPtr = head;
        Node refPtr = head;

        // Move the reference pointer N nodes ahead
        for (int i = 0; i < N; i++) {
            if (refPtr == null) {
                return null; // N is greater than the length of the linked list
            }
            refPtr = refPtr.next;
        }

        // Move both pointers until the reference pointer reaches the end
        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }

        return mainPtr;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Take input from the user for the linked list elements
        // ...

        // Take input from the user for N
        // ...

        // Find the Nth node from the end
        int N = 3; // Example value, replace with user input
        Node nthNodeFromEnd = linkedList.findNthNodeFromEnd(N);

        if (nthNodeFromEnd != null) {
            System.out.println("The " + N + "th node from the end is: " + nthNodeFromEnd.data);
        } else {
            System.out.println("Invalid input or N is greater than the length of the linked list.");
        }
    }
}
