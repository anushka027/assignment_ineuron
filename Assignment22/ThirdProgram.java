import java.util.Stack;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreePaths {
    Node root;

    // Function to print all root-to-leaf paths without using recursion
    void printPaths(Node root) {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Stack<String> pathStack = new Stack<>();
        pathStack.push(Integer.toString(root.data));

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            String currentPath = pathStack.pop();

            if (current.left == null && current.right == null) {
                System.out.println(currentPath); // Print the path
            }

            if (current.right != null) {
                stack.push(current.right);
                pathStack.push(currentPath + "->" + current.right.data);
            }

            if (current.left != null) {
                stack.push(current.left);
                pathStack.push(currentPath + "->" + current.left.data);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreePaths tree = new BinaryTreePaths();

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

        // Print all root-to-leaf paths
        tree.printPaths(tree.root);
    }
}