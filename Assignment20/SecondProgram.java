import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SecondProgram {

    public static TreeNode constructBST(int[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < levelOrder.length) {
            TreeNode current = queue.poll();

            if (levelOrder[i] < current.val) {
                current.left = new TreeNode(levelOrder[i]);
                queue.add(current.left);
                i++;
            }

            if (i < levelOrder.length && levelOrder[i] > current.val) {
                current.right = new TreeNode(levelOrder[i]);
                queue.add(current.right);
                i++;
            }
        }

        return root;
    }

    public static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        int[] levelOrder = {4, 2, 6, 1, 3, 5, 7};

        TreeNode root = constructBST(levelOrder);

        System.out.println("Inorder traversal of the constructed BST:");
        inorderTraversal(root);
    }
}