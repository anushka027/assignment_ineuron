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

    void retainDelete(int M, int N) {
        if (head == null || M <= 0 || N <= 0) {
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            // Traverse M nodes
            for (int i = 0; i < M && current != null; i++) {
                prev = current;
                current = current.next;
            }

            // Delete N nodes
            for (int i = 0; i < N && current != null; i++) {
                current = current.next;
            }

            // Connect the previous node to the next node after deleting N nodes
            prev.next = current;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Take input from the user for the linked list elements
        // ...

        // Take input from the user for M and N
        // ...

        int M = 3; // Example value, you can change it to the user's input
        int N = 2; // Example value, you can change it to the user's input

        System.out.println("Linked list before retaining and deleting:");
        linkedList.display();

        linkedList.retainDelete(M, N);

        System.out.println("Linked list after retaining and deleting:");
        linkedList.display();
    }
}
