public class ThirdProgram {
    static class Node {
    int data;
    Node next;
    Node bottom;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

static class LinkedList {
    Node head;

    // Function to merge two sorted linked lists
    public Node merge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null;
        return result;
    }

    // Function to flatten the linked list
    public Node flatten(Node root) {
        // Base case: if the root is null or next is null, return the root
        if (root == null || root.next == null)
            return root;

        // Recursively flatten the next list
        root.next = flatten(root.next);

        // Merge the current list with the flattened next list
        root = merge(root, root.next);

        // Return the merged list
        return root;
    }

    // Function to display the flattened linked list
    public void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.bottom;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a linked list with sorted sub-linked lists
        list.head = new Node(5);
        list.head.next = new Node(10);
        list.head.next.next = new Node(19);
        list.head.next.next.next = new Node(28);

        list.head.bottom = new Node(7);
        list.head.bottom.bottom = new Node(8);
        list.head.bottom.bottom.bottom = new Node(30);

        list.head.next.bottom = new Node(20);

        list.head.next.next.bottom = new Node(22);
        list.head.next.next.bottom.bottom = new Node(50);

        list.head.next.next.next.bottom = new Node(35);
        list.head.next.next.next.bottom.bottom = new Node(40);
        list.head.next.next.next.bottom.bottom.bottom = new Node(45);

        // Flatten the linked list
        Node flattenedList = list.flatten(list.head);

        // Display the flattened linked list
        System.out.println("Flattened Linked List:");
        list.display(flattenedList);
    }
}

}
