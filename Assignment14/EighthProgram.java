import java.util.HashMap;
import java.util.Map;

public class EighthProgram {
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        int cumulativeSum = 0;
        Map<Integer, ListNode> sumMap = new HashMap<>();

        while (current != null) {
            cumulativeSum += current.val;

            if (sumMap.containsKey(cumulativeSum)) {
                ListNode prevNode = sumMap.get(cumulativeSum).next;
                int sum = cumulativeSum + prevNode.val;

                while (prevNode != current) {
                    sum += prevNode.val;
                    sumMap.remove(sum);
                    prevNode = prevNode.next;
                }

                sumMap.get(cumulativeSum).next = current.next;
            } else {
                sumMap.put(cumulativeSum, current);
            }

            current = current.next;
        }

        return dummy.next;ss
    }
}

}
