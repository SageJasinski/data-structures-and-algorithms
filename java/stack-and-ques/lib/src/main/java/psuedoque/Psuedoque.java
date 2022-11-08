package psuedoque;

import stack.and.ques.Stack;

public class Psuedoque {
  public Stack inbox =new Stack();
  public Stack outbox = new Stack();

  public void enqueue(int value){
    inbox.push(value);
  }

  public int dequeue(){
    if (outbox.isEmpty()){
      while(!inbox.isEmpty()){
        outbox.push(inbox.pop());
      }
    }
    return outbox.pop();
  }
}
