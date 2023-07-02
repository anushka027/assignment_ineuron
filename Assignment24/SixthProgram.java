import java.util.*;

class KMostFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        // Count the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Create a priority queue (min-heap) to store the k most frequent words
        PriorityQueue<String> pq = new PriorityQueue<>(
                (w1, w2) -> wordFrequency.get(w1).equals(wordFrequency.get(w2)) ?
                        w2.compareTo(w1) : wordFrequency.get(w1) - wordFrequency.get(w2)
        );

        // Iterate through the word-frequency map
        for (String word : wordFrequency.keySet()) {
            pq.offer(word); // Add the word to the priority queue
            if (pq.size() > k) {
                pq.poll(); // Remove the least frequent word if the priority queue size exceeds k
            }
        }

        // Build the result list by extracting words from the priority queue
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(0, pq.poll()); // Add words to the front of the list for correct order
        }

        return result;
    }

    public static void main(String[] args) {
        KMostFrequentWords solution = new KMostFrequentWords();

        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> topK = solution.topKFrequent(words, k);
        System.out.println("Top " + k + " Frequent Words: " + topK);
    }
}