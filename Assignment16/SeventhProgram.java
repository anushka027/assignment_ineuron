 import java.util.Stack;

public class SeventhProgram {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "world", "destroy", "hello"};

        int remainingWords = checkPairwiseDestruction(words);
        System.out.println("Number of words left after destruction: " + remainingWords);
    }

    public static int checkPairwiseDestruction(String[] words) {
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (stack.isEmpty() || !word.equals(stack.peek())) {
                stack.push(word);
            } else {
                stack.pop();
            }
        }

        return stack.size();
    }
}