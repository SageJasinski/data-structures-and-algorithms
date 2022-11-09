package stack.and.ques;

import java.net.InetSocketAddress;

public class Node {
  public Node next;
  public Integer data;

  public String value;

  public void  add(int value, Node next){
    Node n = new Node();
    n.data = value;
    n.next = next;
  }

}
