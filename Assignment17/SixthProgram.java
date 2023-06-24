import java.util.*;

public class SixthProgram {

public static int[] deckRevealedIncreasing(int[] deck) {
    int n = deck.length;
    Arrays.sort(deck); // Sort the deck in decreasing order initially

    Deque<Integer> deque = new LinkedList<>();
    deque.offer(deck[n - 1]); // Start with the largest card

    for (int i = n - 2; i >= 0; i--) {
        deque.offerFirst(deque.pollLast()); // Move the last card to the top
        deque.offerFirst(deck[i]); // Reveal the current card at the top
    }

    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        result[i] = deque.poll();
    }

    return result;
}

}
