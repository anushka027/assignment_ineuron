 class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeFlip {
    Node root;

    // Function to perform the flip operation
    Node flipTree(Node node) {
        // If the node is null or a leaf node, return it
        if (node == null || isLeaf(node))
            return node;

        // Recursively flip the left and right subtrees
        Node flippedLeft = flipTree(node.left);
        Node flippedRight = flipTree(node.right);

        // Make the leftmost node the new root
        node.left = null;
        node.right = null;

        // Reconstruct the flipped tree
        if (flippedLeft != null) {
            node.left = flippedLeft;
            flippedLeft.right = node;
        }
        if (flippedRight != null) {
            node.right = flippedRight;
            flippedRight.left = node;
        }

        return node;
    }

    // Helper function to check if a node is a leaf node
    boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    // Helper function to print the flipped tree (inorder traversal)
    void printTree(Node node) {
        if (node == null)
            return;

        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeFlip tree = new BinaryTreeFlip();

        /* Constructing the binary tree
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Flip the binary tree
        tree.flipTree(tree.root);

        // Print the flipped tree (inorder traversal)
        tree.printTree(tree.root);
    }
}