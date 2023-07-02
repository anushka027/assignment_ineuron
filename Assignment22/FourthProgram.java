  class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class SameTreeCheck {
    Node root;

    // Function to check if the given traversals correspond to the same tree
    boolean isSameTree(int[] preOrder, int[] inOrder, int[] postOrder) {
        // Reconstruct the tree using pre-order and in-order traversals
        Node reconstructedTree = buildTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);

        // Compare the reconstructed tree with the post-order traversal
        return compareTrees(reconstructedTree, postOrder, postOrder.length - 1);
    }

    // Helper function to build the tree using pre-order and in-order traversals
    Node buildTree(int[] preOrder, int[] inOrder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        int rootData = preOrder[preStart];
        Node root = new Node(rootData);

        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

        int leftTreeSize = rootIndex - inStart;

        root.left = buildTree(preOrder, inOrder, preStart + 1, preStart + leftTreeSize, inStart, rootIndex - 1);
        root.right = buildTree(preOrder, inOrder, preStart + leftTreeSize + 1, preEnd, rootIndex + 1, inEnd);

        return root;
    }

    // Helper function to compare the tree with post-order traversal
    boolean compareTrees(Node root, int[] postOrder, int postIndex) {
        if (root == null && postIndex < 0)
            return true;

        if (root == null || postIndex < 0)
            return false;

        if (root.data != postOrder[postIndex])
            return false;

        boolean leftMatch = compareTrees(root.left, postOrder, postIndex - 1);
        boolean rightMatch = compareTrees(root.right, postOrder, postIndex - 1);

        return leftMatch || rightMatch;
    }

    public static void main(String[] args) {
        SameTreeCheck tree = new SameTreeCheck();

        int[] preOrder = {1, 2, 4, 5, 3};
        int[] inOrder = {4, 2, 5, 1, 3};
        int[] postOrder = {4, 5, 2, 3, 1};

        boolean isSame = tree.isSameTree(preOrder, inOrder, postOrder);

        System.out.println("Are the traversals of the same tree? " + isSame);
    }
}