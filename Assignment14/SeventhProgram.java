import java.util.*;

public class SeventhProgram {
    
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Step 1: Store the values of each node in an array
        List<Integer> nodeList = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nodeList.add(current.val);
            current = current.next;
        }

        // Step 2: Initialize the result array
        int[] result = new int[nodeList.size()];

        // Step 3: Initialize the stack
        Stack<Integer> stack = new Stack<>();

        // Step 4: Traverse the linked list
        for (int i = 0; i < nodeList.size(); i++) {
            int currentValue = nodeList.get(i);

            // Process elements in the stack
            while (!stack.isEmpty() && currentValue > nodeList.get(stack.peek())) {
                result[stack.pop()] = currentValue;
            }

            // Push the index onto the stack
            stack.push(i);
        }

        // Step 5: Return the result array
        return result;
    }
}
   
}
