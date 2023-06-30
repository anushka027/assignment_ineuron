import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class FirstProgram {
    public TreeNode convertBinaryTreeToBST(TreeNode root) {
        // Step 1: Traverse the binary tree and store nodes in a list
        List<TreeNode> nodeList = new ArrayList<>();
        inOrderTraversal(root, nodeList);

        // Step 2: Sort the list of nodes based on their values
        Collections.sort(nodeList, (node1, node2) -> Integer.compare(node1.value, node2.value));

        // Step 3: Rebuild the binary search tree
        return buildBST(nodeList, 0, nodeList.size() - 1);
    }

    private void inOrderTraversal(TreeNode node, List<TreeNode> nodeList) {
        if (node == null)
            return;

        inOrderTraversal(node.left, nodeList);
        nodeList.add(node);
        inOrderTraversal(node.right, nodeList);
    }

    private TreeNode buildBST(List<TreeNode> nodeList, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode root = nodeList.get(mid);

        root.left = buildBST(nodeList, start, mid - 1);
        root.right = buildBST(nodeList, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(4);

        FirstProgram converter = new FirstProgram();
        TreeNode bstRoot = converter.convertBinaryTreeToBST(root);

    }
}