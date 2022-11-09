package shelter;

import stack.and.ques.Node;
import stack.and.ques.Que;

import java.util.Objects;

public class AnimalShelter {

  public static Node animal = new Node();

  public void enqueue(Node animal) {
    animal.next = Que.tail;
    Que.tail = animal;
  }

  public Node deque(String pref) {
     Node cur = Que.front;

    while (cur.next != null) {
      if (Objects.equals(cur.value, pref)) {
        return cur;
      }
      cur = cur.next;
    }
    if (cur.next == null) {
      return null;
    }
    return cur;
  }
}
