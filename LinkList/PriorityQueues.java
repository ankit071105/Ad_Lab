import java.util.PriorityQueue;

public class PriorityQueues {
    private PriorityQueue<Integer> a;
    public PriorityQueues() {
        a = new PriorityQueue<>(); 
    }
    public void addElement(int value) {
        a.add(value);
        System.out.println(value + " added to the priority queue");
    }
    public int removeElement() {
        if (!a.isEmpty()) {
            int removedValue = a.remove();
            System.out.println(removedValue + " removed from the priority queue");
            return removedValue;
        } else {
            System.out.println("Priority queue is empty.");
            return -1;  
        }
    }
    public int peekElement() {
        if (!a.isEmpty()) {
            return a.peek();
        } else {
            System.out.println("Priority queue is empty.");
            return -1;
        }
    }
    public boolean isEmpty() {
        return a.isEmpty();
    }
    public static void main(String[] args) {
        PriorityQueues s = new PriorityQueues();
        s.addElement(30);
        s.addElement(10);
        s.addElement(20);
        System.out.println("Element with highest priority: " + s.peekElement());
        s.removeElement();
        s.removeElement();
        System.out.println("Is the priority queue empty? " + s.isEmpty());
        s.removeElement();
        System.out.println("Is the priority queue empty? " + s.isEmpty());
    }
}

