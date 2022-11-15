public class FindMax {
  public static int findTheMax(Node node) {
    int max = 0;
    if (node == null) {
    }max = node.data;
    int leftRef = findTheMax(node.left);
    int rightRef = findTheMax(node.right);

    if (leftRef > max)
      max = leftRef;
    if (rightRef > max)
      max = rightRef;
    return max;
  }
}
