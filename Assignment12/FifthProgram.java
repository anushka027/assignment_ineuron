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

    void createLoop(int x) {
        if (head == null || x <= 0) {
            return;
        }

        Node currentNode = head;
        Node loopNode = null;

        int count = 1;
        while (currentNode.next != null) {
            if (count == x) {
                loopNode = currentNode;
            }
            currentNode = currentNode.next;
            count++;
        }

        if (loopNode != null) {
            currentNode.next = loopNode;
        }
    }

    void removeLoop() {
        if (head == null || head.next == null) {
            return;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        // Detect the loop
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                break;
            }
        }

        // No loop found
        if (fastPtr == null || fastPtr.next == null) {
            return;
        }

        // Move slowPtr to the head and move both pointers at the same pace until they meet
        slowPtr = head;
        while (slowPtr.next != fastPtr.next) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        // Break the loop by setting the next pointer of the last node to null
        fastPtr.next = null;
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

        // Take input from the user for the position of the loop (X)
        // ...

        int x = 3; // Example value, you can change it to the user's input

        linkedList.createLoop(x);

        System.out.println("Linked list before removing the loop:");
        linkedList.display();

        linkedList.removeLoop();

        System.out.println("Linked list after removing the loop:");
        linkedList.display();
    }
}