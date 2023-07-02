import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    int horizontalDistance;
    Node left, right;

    public Node(int data) {
        this.data = data;
        horizontalDistance = Integer.MAX_VALUE;
        left = right = null;
    }
}

class BinaryTreeBottomView {
    Node root;

    // Function to print the bottom view of the binary tree
    void printBottomView() {
        if (root == null)
            return;

        TreeMap<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();

        // Set the horizontal distance of the root node to 0
        root.horizontalDistance = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Update the horizontal distance of the nodes in the tree
            bottomViewMap.put(current.horizontalDistance, current.data);

            if (current.left != null) {
                current.left.horizontalDistance = current.horizontalDistance - 1;
                queue.add(current.left);
            }

            if (current.right != null) {
                current.right.horizontalDistance = current.horizontalDistance + 1;
                queue.add(current.right);
            }
        }

        // Print the bottom view nodes from left to right
        for (int value : bottomViewMap.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeBottomView tree = new BinaryTreeBottomView();

        /* Constructing the binary tree
                20
               /  \
              8    22
             / \    \
            5   3    25
               / \
              10  14
        */
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        // Print the bottom view of the binary tree
        tree.printBottomView();
    }
}