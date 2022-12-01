/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hash;

import javax.print.attribute.HashAttributeSet;
import java.util.Hashtable;

public class Library {
    public void someLibraryMethod() {
      Hashtable<Integer, String> table = new Hashtable<Integer, String>();

      //adds  k v to the hashtable
      table.put(1, "tim");
      table.put(2, "george");
      table.put(3, "asuka");

      //given a key will return the value of the hash at that key
      table.get(3);

      //Will check if the key is present
      table.containsKey(2);

      //Prints out a list of all keys in the hashtable
      table.keys();

      //isn't the point of using a hash table to not have indexes?
    }
}