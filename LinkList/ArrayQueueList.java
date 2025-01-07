import java.util.ArrayList;

class QueueArrayList {
     ArrayList<Integer> a;
    public QueueArrayList() {
        a = new ArrayList<>();
    }
    public void enqueue(int value) {
        a.add(value);
        System.out.println(value + " added to queue");
    }
    public int dequeue() {
        if (!empty()) {
            int dequeuedValue = a.remove(0);
            System.out.println(dequeuedValue + " removed from queue");
            return dequeuedValue;
        } else {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return -1;
        }
    }
    public int front() {
        if (!empty()) {
            return a.get(0);
        } else {
            System.out.println("Queue is empty. Nothing to show.");
            return -1;
        }
    }
    public boolean empty() {
        return a.isEmpty();
    }
}

public class ArrayQueueList {
    public static void main(String[] args) {
        QueueArrayList s = new QueueArrayList();
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        System.out.println("Front element is: " +s.front());
        s.dequeue();
        System.out.println("Is queue empty? " +s.empty());
        s.dequeue();
        s.dequeue();
        System.out.println("Is queue empty? " +s.empty());
    }
}
