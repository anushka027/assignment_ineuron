import java.util.LinkedList;
import java.util.Queue;
public class FourthProgram {
    private Queue<Integer> requests;

    public FourthProgram() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.offer(t); 
        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
    }
}