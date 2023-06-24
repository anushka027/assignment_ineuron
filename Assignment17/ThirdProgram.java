import java.util.*;
public class ThirdProgram {
    
public static int countStudents(int[] students, int[] sandwiches) {
    Queue<Integer> queue = new LinkedList<>();
    for (int student : students) {
        queue.offer(student);
    }
    
    int index = 0; 
    int count = 0; 
    
    while (!queue.isEmpty()) {
        if (queue.peek() == sandwiches[index]) {
            queue.poll(); 
            count = 0; 
        } else {
            queue.offer(queue.poll()); 
            count++;
        }
        
        index++;
    
        if (count == queue.size()) {
            break;
        }
        
        if (index == sandwiches.length) {
            index = 0;
        }
    }
    
    return count;
}

}
