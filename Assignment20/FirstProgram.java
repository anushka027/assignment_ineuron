class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Result {
    int maxSum;
    TreeNode maxSumSubtree;

    Result(int maxSum, TreeNode maxSumSubtree) {
        this.maxSum = maxSum;
        this.maxSumSubtree = maxSumSubtree;
    }
}

public class FirstProgram {

    public static TreeNode findMaxSumSubtree(TreeNode root) {
        Result result = findMaxSumSubtreeHelper(root);
        return result.maxSumSubtree;
    }

    private static Result findMaxSumSubtreeHelper(TreeNode node) {
        if (node == null) {
            return new Result(0, null);
        }

        Result leftResult = findMaxSumSubtreeHelper(node.left);
        Result rightResult = findMaxSumSubtreeHelper(node.right);

        int currentSum = node.val + leftResult.maxSum + rightResult.maxSum;

        // Check if the current subtree has a larger sum than the previous maximum
        if (currentSum > leftResult.maxSum && currentSum > rightResult.maxSum) {
            return new Result(currentSum, node);
        }

        // Return the subtree with the maximum sum
        if (leftResult.maxSum > rightResult.maxSum) {
            return new Result(leftResult.maxSum, leftResult.maxSumSubtree);
        } else {
            return new Result(rightResult.maxSum, rightResult.maxSumSubtree);
        }
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(-6);
        root.right.right = new TreeNode(2);

        // Find the subtree with the maximum sum
        TreeNode maxSumSubtree = findMaxSumSubtree(root);

        System.out.println("Maximum sum subtree: " + maxSumSubtree.val);
    }
}