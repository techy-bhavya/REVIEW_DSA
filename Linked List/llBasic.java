class Node{
  int data;
  Node next;
  
  public Node(int data){
      this.data = data;
      this.next = null;
  }
}

class LinkedList{
  Node head;
  Node tail;
  int size;

  public LinkedList(){
      this.head = null;
      this.tail = null;
      this.size = 0;
  }
  
  public void addLast(int val){
      Node newNode = new Node(val);
      
      if(head==null){
          head = newNode;
          tail = newNode;
      }
      else{
          tail.next = newNode;
          tail = newNode;
      }
      size++;
  }
  
  public void addFirst(int val){
      Node newNode = new Node(val);
      
      if(head==null){
          head = newNode;
          tail = newNode;
      }
      else{
          newNode.next = head;
          head = newNode;
      }
      size++;
  }
  
  public void display(){
      Node temp = head;
      while(temp!=null){
          System.out.print(temp.data);
          
          if (temp.next != null) {
          System.out.print(" -> ");
          }
          
          temp=temp.next;
      }
      System.out.println();
  }
}

public class llBasic
{
public static void main(String[] args) {
  LinkedList ll = new LinkedList();
  ll.addLast(23);
  ll.addLast(43);
  ll.addLast(13);
  ll.addFirst(50);
  ll.addFirst(37);
  ll.display();
}
}



