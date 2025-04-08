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

public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insert(40);
    dll.insert(50);
    dll.insert(30);
    dll.insert(70);
    dll.insert(10);
    dll.displaybackward();
    dll.displayforward();
}
}

