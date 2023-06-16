public class SixthProgram {
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode leftShiftLinkedList(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = getLinkedListLength(head);
        k = k % length; // Normalize k to be within the length of the list

        if (k == 0) {
            return head;
        }

        ListNode current = head;
        ListNode newHead = null;

        // Find the (k+1)th node from the beginning
        for (int i = 1; i < k; i++) {
            current = current.next;
        }

        newHead = current.next;
        current.next = null;

        // Traverse to the end of the list
        current = newHead;
        while (current.next != null) {
            current = current.next;
        }

        // Connect the last node's next pointer to the original head
        current.next = head;

        return newHead;
    }

    // Helper function to get the length of the linked list
    private int getLinkedListLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}

}
