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

class DoublyLinkedListNode {
    int value;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

public class ThirdProgram {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    public DoublyLinkedListNode convertBinaryTreeToDoublyLinkedList(TreeNode root) {
        head = null;
        tail = null;
        convert(root);
        return head;
    }

    private void convert(TreeNode node) {
        if (node == null)
            return;

        convert(node.left);

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(node.value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        convert(node.right);
    }

    // Example usage:
    public static void main(String[] args) {
        // Given Binary Tree:
        //           4
        //         /   \
        //        2     5
        //       / \   / \
        //      1   3 6   7

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ThirdProgram converter = new ThirdProgram();
        DoublyLinkedListNode head = converter.convertBinaryTreeToDoublyLinkedList(root);

        // Print the doubly linked list
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
