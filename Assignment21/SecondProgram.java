class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class SecondProgram {
    public int findDistance(TreeNode root, int node1, int node2) {
        TreeNode lcaNode = findLowestCommonAncestor(root, node1, node2);

        int distance1 = findDistanceFromNode(lcaNode, node1, 0);
        int distance2 = findDistanceFromNode(lcaNode, node2, 0);

        return distance1 + distance2;
    }

    private TreeNode findLowestCommonAncestor(TreeNode root, int node1, int node2) {
        if (root == null)
            return null;

        if (root.value > node1 && root.value > node2)
            return findLowestCommonAncestor(root.left, node1, node2);

        if (root.value < node1 && root.value < node2)
            return findLowestCommonAncestor(root.right, node1, node2);

        return root;
    }

    private int findDistanceFromNode(TreeNode node, int target, int distance) {
        if (node == null)
            return -1;

        if (node.value == target)
            return distance;

        if (node.value > target)
            return findDistanceFromNode(node.left, target, distance + 1);

        return findDistanceFromNode(node.right, target, distance + 1);
    }

    // Example usage:
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.left.right = new TreeNode(7);

        SecondProgram calculator = new SecondProgram();
        int distance = calculator.findDistance(root, 1, 7);
        System.out.println("Distance between nodes 1 and 7: " + distance); // Output: 4
    }
}