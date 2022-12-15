package graph;

import org.w3c.dom.Node;

import java.util.Iterator;

public class DepthSearch {
  public void depth(Graph.Node node, boolean visited[]){
    visited[node] =true;

    Iterator<Integer> i = adj[node].listIterator();

    while(i.hasNext()){
      int n = i.next();
      if(!visited[n]){
        depth(n, visited);
      }
    }
  }

  public void search(Node node){
    boolean visited[] = new boolean[node];
    depth(node, visited);
}
}
