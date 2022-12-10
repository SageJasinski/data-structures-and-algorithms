package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {
  private Map<Node, List<Node>> adjacent;

  class Node{
    int value, weight;
    Node(int value) {
      this.value = value;
    }
  }

  void addNode(int value)
  {
    adjacent.putIfAbsent(new Node(value), new ArrayList<>());
  }

  void removeNode(int value)
  {
    Node node = new Node(value);
    adjacent.values().stream().forEach(e -> e.remove(value));
    adjacent.remove(new Node(value));
  }

  void addEdge(int value1, int value2)
  {
    Node node1 = new Node(value1);
    Node node2 = new Node(value2);
    List<Node> eNode1 = adjacent.get(node2);
    List<Node> eNode2 = adjacent.get(node1);
  }

  void removeEdge(int value1, int value2)
  {
    Node node1 = new Node(value1);
    Node node2 = new Node(value2);
    List<Node> eNode1 = adjacent.get(node1);
    List<Node> eNode2 =adjacent.get(node2);
    if(eNode1 != null)
    {
      eNode1.remove(node2);
    }
    if(eNode2 != null)
    {
      eNode2.remove(node1);
    }
  }

  List<Node> getAdjacentNodes(int value)
  {
    return  adjacent.get(new Node(value));
  }

}
