public class FifthProgram {
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;

        ListNode current = evenHead.next;
        int index = 3; // Index of the current node (starting from 3rd node)

        while (current != null) {
            if (index % 2 != 0) { // Odd index
                odd.next = current;
                odd = odd.next;
            } else { // Even index
                even.next = current;
                even = even.next;
            }

            current = current.next;
            index++;
        }

        odd.next = evenHead;
        even.next = null;

        return oddHead;
    }
}

}
