package stack.and.ques;

public class Stack {

  Node top = new Node();
  Node newnode = new Node();
  public Integer push(int value){
    newnode.data = value;

    if(top.next == null){
      newnode.next = null;
      top = newnode;
      return top.data;
    }else{
      newnode.next = top;
      top = newnode;
      return top.data;
    }
  }

  public int pop(){
    if(top.next != null){
      top.next = null;
      return top.data;
    }else{
      System.out.println("pop error: empty list");
      return top.data;
    }
  }

  public Integer peek(){
    if(top.data != null){
      return top.data;
    }else{
      System.out.println("peek error: top data is null");
      return top.data;
    }
  }

  public boolean isEmpty(){
    if(top.next != null){
      return false;
    }else {
      return true;
    }
  }
}
