    class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // An empty list or a list with a single node is considered a palindrome
        }

        Node slowPtr = head;
        Node fastPtr = head;

        // Move the fast pointer twice as fast as the slow pointer
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // Reverse the second half of the linked list
        Node secondHalf = reverseList(slowPtr);

        // Compare the first half and the reversed second half of the linked list
        Node current1 = head;
        Node current2 = secondHalf;
        while (current2 != null) {
            if (current1.data != current2.data) {
                return false; // The characters don't match, so it's not a palindrome
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return true; // All characters matched, so it's a palindrome
    }

    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Take input from the user for the linked list characters
        // ...

        boolean isPalindrome = linkedList.isPalindrome();

        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}