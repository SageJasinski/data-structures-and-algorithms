package datastructures.linkedlist;

public class LinkedList {
  static Node head;
  static java.util.LinkedList<String> lincoln = new java.util.LinkedList<>();

  public static void main(String[] args) {

    add("maddie");
    add("truman");
    add("eleanor");
    toStringify(lincoln);
  }

  public static void add(String data) {
    lincoln.add(data);
  }

  public boolean includes(java.util.LinkedList<String> findIn, String search) {
    return findIn.contains(search);
  }


  public static String toStringify(java.util.LinkedList list) {

    String listed = list.toString();

    String[] words = listed.split(",");

    StringBuilder visual = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
      visual.append("{").append(words[i]).append("} -> ");
    }
    String togetherNow = (visual + "NULL");
    return togetherNow;
  }
}
