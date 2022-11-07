package stack.and.ques;

public class Linkedlist {

  Node node1 = new Node();
  Node node2 = new Node();

  public static void listcreated(){
    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();

    node1.add(1, node2);
    node2.add(2,node3);
    node3.add(3,null);

  }
}
