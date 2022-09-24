package src.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("America");
        queue.add("Zambia");
        queue.add("Kenya");
        queue.add("Austria");
        System.out.println("All queue: " + queue);
        queue.remove();
        System.out.println("After removing queue: " + queue);
        queue.poll();
        System.out.println("After polling queue: " + queue);
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

    }
}
