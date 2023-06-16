public class SecondProgram {
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

    public Node addOne() {
        Node dummy = new Node(0); // Create a dummy node
        dummy.next = head;
        Node lastNonNine = dummy; // Track the rightmost non-nine digit

        // Traverse the list to find the rightmost non-nine digit
        Node current = head;
        while (current != null) {
            if (current.data != 9)
                lastNonNine = current;
            current = current.next;
        }

        // Increment the rightmost non-nine digit by 1
        lastNonNine.data += 1;

        // Set all the digits to the right of the rightmost non-nine digit to 0
        current = lastNonNine.next;
        while (current != null) {
            current.data = 0;
            current = current.next;
        }

        // If the dummy node is still the first node, remove it
        if (dummy.data == 0)
            return dummy.next;
        else
            return dummy;
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

        // Creating a linked list representing the number 123
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        // Displaying the initial list
        System.out.print("Initial list: ");
        list.display();

        // Add 1 to the number
        Node result = list.addOne();

        // Displaying the modified list after adding 1
        System.out.print("List after adding 1: ");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();
    }
}

}
