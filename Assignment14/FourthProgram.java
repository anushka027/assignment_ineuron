public class FourthProgram {
    class Node {
    int data;
    Node next;
    Node random;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class LinkedList {
    Node head;

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        // Step 1: Create a copy of each node and insert it next to the original node
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.data);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // Step 2: Update the random pointers of the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null)
                current.next.random = current.random.next;
            current = current.next.next;
        }

        // Step 3: Separate the original list and the copied list
        Node original = head;
        Node copy = head.next;
        Node copyHead = copy;

        while (original != null) {
            original.next = original.next.next;
            if (copy.next != null)
                copy.next = copy.next.next;

            original = original.next;
            copy = copy.next;
        }

        // Step 4: Return the head of the copied list
        return copyHead;
    }
}

}
