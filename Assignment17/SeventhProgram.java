import java.util.*;
public class SeventhProgram {
    Deque<Integer> frontDeque;
    Deque<Integer> backDeque;

    public SeventhProgram() {
        frontDeque = new LinkedList<>();
        backDeque = new LinkedList<>();
    }

    public void pushFront(int val) {
        frontDeque.offerFirst(val);
        balanceQueues();
    }

    public void pushMiddle(int val) {
        if (frontDeque.size() > backDeque.size()) {
            backDeque.offerFirst(frontDeque.pollLast());
        }
        frontDeque.offerLast(val);
    }

    public void pushBack(int val) {
        backDeque.offerLast(val);
        balanceQueues();
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        if (frontDeque.isEmpty()) {
            return backDeque.pollFirst();
        }
        return frontDeque.pollFirst();
    }

    public int popMiddle() {
        if (isEmpty()) {
            return -1;
        }
        if (frontDeque.size() == backDeque.size()) {
            return frontDeque.pollLast();
        }
        return backDeque.pollFirst();
    }

    public int popBack() {
        if (isEmpty()) {
            return -1;
        }
        if (backDeque.isEmpty()) {
            return frontDeque.pollLast();
        }
        return backDeque.pollLast();
    }

    private void balanceQueues() {
        if (frontDeque.size() > backDeque.size() + 1) {
            backDeque.offerFirst(frontDeque.pollLast());
        } else if (frontDeque.size() < backDeque.size()) {
            frontDeque.offerLast(backDeque.pollFirst());
        }
    }

    private boolean isEmpty() {
        return frontDeque.isEmpty() && backDeque.isEmpty();
    }
}