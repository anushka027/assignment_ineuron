import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeLeftView {
    Node root;

    // Function to print the left view of the binary tree
    void printLeftView() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();

                // Print the leftmost node at the first position in each level
                if (i == 0)
                    System.out.print(current.data + " ");

                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeLeftView tree = new BinaryTreeLeftView();

        /* Constructing the binary tree
                1
               / \
              2   3
             / \   \
            4   5   6
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Print the left view of the binary tree
        tree.printLeftView();
    }
}