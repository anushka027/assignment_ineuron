import java.util.*;

import javax.swing.tree.TreeNode;
public class FourthProgram {
    
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeFromString {
    private static int index; // Global variable to keep track of the current position in the string

    public static TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        // Process the first number in the string
        int numEnd = findNumberEnd(s);
        int val = Integer.parseInt(s.substring(0, numEnd));
        TreeNode root = new TreeNode(val);

        // Check if there are any children
        if (numEnd < s.length()) {
            if (s.charAt(numEnd) == '(') {
                // Process the left child
                index = numEnd + 1;
                root.left = str2tree(s);

                // Process the right child if it exists
                if (index < s.length() && s.charAt(index) == '(') {
                    index++; // Skip the '('
                    root.right = str2tree(s);
                }
            }
        }

        return root;
    }

    private static int findNumberEnd(String s) {
        int end = index;

        while (end < s.length() && Character.isDigit(s.charAt(end))) {
            end++;
        }

        return end;
    }

    // Helper function to perform inorder traversal of the binary tree
    private static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string representation of the binary tree: ");
        String s = scanner.nextLine();

        TreeNode root = str2tree(s);

        System.out.print("Inorder traversal of the constructed binary tree: ");
        inorderTraversal(root);
    }
}
