import java.util.ArrayList;

public class BinarTree {
  static Node root;
  static ArrayList values;

  public static void preOrder(Node node, ArrayList data){

    if (node == null){
      return;
    }else {
      data.add(node.data);
      preOrder(node.left, data);
      preOrder(node.right, data);
    }
  }
  public static void inOrder(Node node, ArrayList value){
    if (node == null){ return; }

    inOrder(node.left, values);
    values.add(node.data);
    inOrder(node.right, values);
  }


  public void postOrder(Node node, ArrayList values) {
    if (node == null) return;

    postOrder(node.left, values);
    postOrder(node.right, values);
    values.add(node.data);
  }

  public void add(Integer data){
    Node newNode = new Node(data);
    Node current = root;

    if (root == null) {
      root = newNode;
      return;
    }

    while (current != null) {
      if (data < current.data) {

        if (current.left == null) {
          current.left = newNode;
          return;
        } else {
          current = current.left;
        }

      } else if (data > current.data) {

        if (current.right == null) {
          current.right = newNode;
          return;
        } else {
          current = current.right;
        }

      } else {
        return;
      }
    }

  }

  public static boolean contains(Integer value){
    Node current = root;
    while (current != null) {
      if (value < current.data) {
        if (current.left == null) {
          return false;
        } else {
          current = current.left;
        }
      } else if (value > current.data) {
        if (current.right == null) {
          return false;
        } else {
          current = current.right;
        }
      } else {
        return true;
      }
    }
    return false;
  }

  }

