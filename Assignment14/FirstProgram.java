public class FirstProgram {
    static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

static class LinkedList {
    Node head;

    public void detectAndRemoveLoop() {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        // Move fast pointer by two steps and slow pointer by one step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If they meet, a loop is present
            if (slow == fast)
                break;
        }

        // If loop exists, find the start node of the loop
        if (slow == fast) {
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            // Unlink the last node to remove the loop
            fast.next = null;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a linked list with a loop
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = list.head.next; // Creating the loop

        // Displaying the initial list
        System.out.print("Initial list: ");
        list.display();

        // Detect and remove the loop
        list.detectAndRemoveLoop();

        // Displaying the modified list after removing the loop
        System.out.print("List after removing the loop: ");
        list.display();
    }
}

}
