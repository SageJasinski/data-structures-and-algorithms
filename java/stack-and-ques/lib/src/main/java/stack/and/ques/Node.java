package stack.and.ques;

import java.net.InetSocketAddress;

public class Node {
  Node next;
  Integer data;


  public void  add(int value, Node next){
    Node n = new Node();
    n.data = value;
    n.next = next;
  }

}
