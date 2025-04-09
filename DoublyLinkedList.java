class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev =null;
    }
}
public class DoublyLinkedList {
      Node head = null;
      Node tail = null;
      public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
           tail = newNode;
      }
      else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
      }

    }
    
    public void displayforward(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
    }
    System.out.println("null");
}
public void displaybackward(){
    Node current = tail;
    while(current != null){
        System.out.print(current.data + " -> ");
        current = current.prev;
}
System.out.println("null");
}
public void insertAtPosition(int data, int position) {
    Node newNode = new Node(data);

    if (position == 1) {
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = newNode;
        return;
    }

    Node current = head;
    for (int i = 1; i < position - 1 && current != null; i++) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Position out of range");
        return;
    }

    newNode.next = current.next;
    newNode.prev = current;
    if (current.next != null)
        current.next.prev = newNode;
    else
        tail = newNode;

    current.next = newNode;
}

public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insert(40);
    dll.insert(50);
    dll.insert(30);
    dll.insert(70);
    dll.insert(10);
    dll.insertAtPosition(90,1);
    dll.insertAtPosition(100,5);
    dll.insertAtPosition(60,7);
    dll.displaybackward();
    dll.displayforward();
}
}

