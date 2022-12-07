package hashmap;

import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashTrees {

  HashMap<Integer, Integer> countCollector = new HashMap<Integer, Integer>();


  public void listOneInOrder(Node node) {
    if(node != null) {
      listOneInOrder(node.left);
      countCollector.put(node.getNodeValue(), 1);
      listOneInOrder(node.right);
    }
  }

  public void listTwoInOrder(Node node) {
    if(node != null) {
      listTwoInOrder(node.left);

      if(node.equals(countCollector.get(node))){
         Integer updatenode = countCollector.get(node);
         updatenode = updatenode ++;
      }

      listTwoInOrder(node.right);
    }
  }

 public Collection<Integer> answer(){
   Collection<Integer> keys = null;
   countCollector.forEach((k,val) -> {
     if (val.equals(2) {
       keys.add(k);
     }
   });
     return keys;
 }
}
