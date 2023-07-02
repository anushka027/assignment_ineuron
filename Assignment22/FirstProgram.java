  class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeToDLL {
    Node root;
    Node head; // Head of the doubly linked list

    // Helper function to do the inorder traversal of the binary tree
    void inorder(Node node) {
        if (node == null)
            return;

        // Recursively convert left subtree
        inorder(node.left);

        // Change right pointer of the current node to point to the next node in inorder traversal
        if (head == null) {
            head = node;
        } else {
            node.right = head;
            head.left = node;
            head = node;
        }

        // Recursively convert right subtree
        inorder(node.right);
    }

    // Function to convert binary tree to doubly linked list
    Node convertToDLL(Node root) {
        // Initialize head as null
        head = null;

        // Convert the binary tree to DLL
        inorder(root);

        return head;
    }

    // Helper function to print the doubly linked list
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
    }

    public static void main(String[] args) {
        BinaryTreeToDLL tree = new BinaryTreeToDLL();

        /* Constructing the binary tree
                   1
                 /   \
                2     3
               / \
              4   5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Convert binary tree to DLL
        Node head = tree.convertToDLL(tree.root);

        // Print the DLL
        tree.printList(head);
    }
}
