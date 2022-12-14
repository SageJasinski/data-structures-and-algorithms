import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
  Queue<Node> queue = new LinkedList<Node>();

  public void breadth(Node root) {
    if (root == null)
      return;
    queue.clear();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node node = queue.remove();
      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);
    }
  }
}
