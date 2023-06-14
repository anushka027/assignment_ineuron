 import java.util.Scanner;

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

    void deleteMiddle() {
        if (head == null || head.next == null) {
            return;
        }

        Node slowPtr = head;
        Node fastPtr = head;
        Node prevPtr = null;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prevPtr = slowPtr;
            slowPtr = slowPtr.next;
        }

        // Delete the second middle node
        prevPtr.next = slowPtr.next;
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the linked list: ");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            linkedList.insert(data);
        }

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.deleteMiddle();

        System.out.println("Linked list after deleting middle element(s):");
        linkedList.display();
    }
}
