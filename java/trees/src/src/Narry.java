import java.util.Stack;

public class Narry {
  static void traverse_tree(Node root) {
    Stack<Node> nodes = new Stack<>();
    nodes.push(root);

    while (!nodes.isEmpty()) {
      Node curr = nodes.pop();
      if (curr != null) {

        for (int i = curr.child.size() - 1; i >= 0; i--) {
          if (curr.child.data % 3 == 0) {
            curr.child.data = "Fizz";
          } else if (curr.child.data % 5 == 0) {
            curr.child.data = "buzz";
          } else if (curr.child.data % 5 == 0 && curr.child.data % 3 == 0) {
            curr.child.data = "FizzBuzz";
          }

          nodes.add(curr.child.get(i));
        }
      }
    }

  }
}
