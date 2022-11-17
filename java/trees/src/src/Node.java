import sun.security.util.DerValue;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
  Node child;
  Integer data;
  Node left;
  Node right;

  public Node() {
  }

  public Node(Integer data){
    this.data = data;
  }

  public Node(Integer data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public Integer getData() {
    return data;
  }

  public void setData(Integer data) {
    this.data = data;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public int size() {

  }

}
