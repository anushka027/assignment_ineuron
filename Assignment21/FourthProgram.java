import java.util.LinkedList;
import java.util.Queue;
    
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

public class FourthProgram  {
    public void connectNodes(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode prev = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (prev != null)
                    prev.next = current;

                prev = current;

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {
      
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        FourthProgram connector = new FourthProgram();
        connector.connectNodes(root);

        // Print the next pointers of each node
        TreeNode current = root;
        while (current != null) {
            TreeNode temp = current;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("null");
            current = current.left;
        }
    }
}

