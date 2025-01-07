import java.util.ArrayList;

class stackArrayLists {
     ArrayList<Integer> obj;
    public stackArrayLists() {
        obj = new ArrayList<>();
    }
    public void push(int value) {
        obj.add(value);
        System.out.println(value + " pushed to stack");
    }
    public int pop() {
        if (!empty()) {
            int poppedValue = obj.remove(obj.size() - 1);
            System.out.println(poppedValue + " popped from stack");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1;
        }
    }
    public int peek() {
        if (!empty()) {
            return obj.get(obj.size() - 1);
        } else {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
    }
    public boolean empty() {
        return obj.isEmpty();
    }
}
public class ArrayListStack {
    public static void main(String[] args) {
        stackArrayLists obj = new stackArrayLists();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("Top element is: " + obj.peek());
        obj.pop();
        System.out.println("Is stack empty? " + obj.empty());
        obj.pop();
        obj.pop();
        System.out.println("Is stack empty? " + obj.empty());
    }
}

