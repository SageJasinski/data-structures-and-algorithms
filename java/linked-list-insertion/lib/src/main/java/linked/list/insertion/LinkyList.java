package linked.list.insertion;

import java.util.ArrayList;


public class LinkyList {

  ArrayList<Integer> list =new ArrayList<>();

  public void appendNumerical(int value){
    Nodes section = new Nodes();
    int node = section.append(value);
    list.add(node);
  }

  public ArrayList<Integer> insertBefore(int index, int value){
    ArrayList<Integer> imLost = new ArrayList<>();

    if(list.size() == 0 ){
      imLost.add(value);
    } else {
      for(int i = 0; i < list.size(); i++){
        if(list.get(i) == index){
          imLost.add((i), value);
          imLost.add(i + 1, list.get(i));
          continue;
        }
        imLost.add(list.get(i));
      }
    }

    return imLost;
  }

  public ArrayList<Integer> insertAfter(int index, int value){
    ArrayList<Integer> imLost = new ArrayList<>();

    if(list.size() == 0 ){
      imLost.add(value);
    } else {
      for(int i = 0; i < list.size(); i++){
        if(list.get(i) == index){
          imLost.add(i, value);
          imLost.add(i, list.get(i));
          continue;
        }
        imLost.add(list.get(i));
      }
    }

    return imLost;
  }
}
