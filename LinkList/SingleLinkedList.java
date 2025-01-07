class Node {
    int data;
    Node next;    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    Node head;  
    public void CreateList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void deleteList(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Node with value " + data + " not found.");
        }
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;    
            current = next;
        }
        head = prev; 
    }
    public void Traversesal() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.CreateList(10);
        linkedList.CreateList(20);
        linkedList.CreateList(30);        
        linkedList.CreateList(50);
        linkedList.CreateList(40);
        System.out.println("After Creating List:");
        linkedList.Traversesal(); 
        linkedList.deleteList(20);
        linkedList.deleteList(50);
        System.out.println("After Deleting List:");
        linkedList.Traversesal(); 
        linkedList.reverse();
        System.out.println("After Reversing:");
        linkedList.Traversesal();  
    }
}
