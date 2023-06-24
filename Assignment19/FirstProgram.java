import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class FirstProgram {
    public ListNode mergeKLists(ListNode[] lists) {
        // Create a min-heap to store the nodes in ascending order
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head nodes of all linked lists to the min-heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Create a dummy node as the head of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Process the nodes in the min-heap until it becomes empty
        while (!minHeap.isEmpty()) {
            // Remove the smallest node from the min-heap
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;

            // Move to the next node in the list
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        // Return the head of the merged list
        return dummy.next;
    }

    // Helper method to create a linked list from an array
    public ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FirstProgram merger = new FirstProgram();

        // Create example linked lists
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {1, 3, 4};
        int[] arr3 = {2, 6};
        ListNode list1 = merger.createList(arr1);
        ListNode list2 = merger.createList(arr2);
        ListNode list3 = merger.createList(arr3);

        // Merge the linked lists
        ListNode[] lists = {list1, list2, list3};
        ListNode mergedList = merger.mergeKLists(lists);

        // Print the merged list
        merger.printList(mergedList);
    }
}
