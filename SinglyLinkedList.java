class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList{
      Node head = null;

      public void insert(int data){
        Node newNode = new Node(data);
        if ( head == null){
            head = newNode;
        }
        else{
            Node current = head ;
            while(current.next != null ){
                current = current.next;
            }
            current.next = newNode;
        }
      }
      public void display(){
        Node current = head;
        while(current != null){
           System.out.print(current.data+" -> ");
           current = current.next;
        }
        System.out.print("null");
      }
      public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

      }
      public void insertAtPosition(int data, int position){
        Node newnode = new Node(data);
        if(position == 1){
        insertAtBeginning(data);
        }
        else{
          Node current = head;
          for(int i = 1; i < position -1; i++){
            current = current.next;
          }
          if(current == null){
            System.out.println("Position is out of range for the position "+position);
            return;
          }
          newnode.next = current.next;
          current.next = newnode;
         
        }
      }
      public void deletefromtheEnd(){
        if(head == null){
          System.out.println("List is empty");
      }
      else if (head.next == null){
        head = null;
      }
      else{
        Node current = head;
        while(current.next.next != null ){
          current = current.next;
      }
      current.next =null;

    }
  }
  public void deletefromtheBeginning(){
    if(head == null){
      System.out.println("List is empty");
    }
    else{
      head = head.next;
  }
}
public void deleteAtPosition(int position) {
  if (head == null) {
      System.out.println("List is empty");
      return;
  }

  if (position == 1) {
      head = head.next;
      return;
  }

  Node current = head;
  for (int i = 1; i < position - 1; i++) {
      if (current.next == null) {
          System.out.println("Position " + position + " is out of range");
          return;
      }
      current = current.next;
  }

  if (current.next == null) {
      System.out.println("Position " + position + " is out of range");
      return;
  }

  current.next = current.next.next;
}

      public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtPosition(30,1);
        list.insertAtPosition(40,2);
        list.insertAtPosition(80,4);
        list.insertAtPosition(100,8);
        list.deletefromtheEnd();
        list.deletefromtheBeginning();
        list.deleteAtPosition(3);
        list.display();
      }
      
}
