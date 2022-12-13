package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthTraversal {
  void BFS(int s)
  {
    boolean visited[] = new boolean[V];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[s]=true;
    queue.add(s);

    while (queue.size() != 0)
    {
      s = queue.poll();
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext())
      {
        int n = i.next();
        if (!visited[n])
        {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
}
