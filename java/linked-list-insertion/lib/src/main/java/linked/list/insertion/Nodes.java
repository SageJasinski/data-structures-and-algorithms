package linked.list.insertion;

import org.w3c.dom.Node;

public class Nodes {
  public Nodes head;
  Nodes next;
  int data;

  public int append(int data){
    Nodes node = new Nodes();
    node.data = data;
    node.next =null;

    if(head == null){
      head = node;
    } else {
      Nodes n = head;
      while(n.next != null){
        n = n.next;
      }
      n.next =node;
    }
    return node.data;
  }

//  public int insertBefore(int index, int data){
//    Nodes node = new Nodes();
//    node.data  = data;
//
//    if(head == null){
//      head = node;
//    }else{
//      Nodes n = head;
//    }
//  }

  public void showNode(){
    Nodes node = head;
    while(node.next != null){
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
  }
}
