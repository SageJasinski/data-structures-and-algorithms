package stack.and.ques;

public class Que {
  public static Node front = new Node();
  public static Node tail = new Node();
  public Node newnode = new Node();

  public Integer enqueue(Integer value){
    tail.next = newnode;
    newnode.data = value;
    tail = newnode;
    return tail.data;
  }

  public Node dequeue(){
    if(front.next != null){
      front.next = null;
      return front;
    }else {
      System.out.println("Dequeue error: front is null");
      return front;
    }
  }

  public Node peek(){
    if(front.next != null){
      return front;
    }else {
      System.out.println("peek error: front is null");
      return front;
    }
  }

  public boolean isEmpty(){
    if(front.next == null){
      return true;
    }else{
      return false;
    }
  }
}
