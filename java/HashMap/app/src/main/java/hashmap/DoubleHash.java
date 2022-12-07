package hashmap;

import java.util.HashMap;

public class DoubleHash {

    HashMap<String, String> mapOne = new HashMap<>();
    HashMap<String, String> mapTwo = new HashMap<>();

    private void traverse() {
      mapTwo.forEach((key, value) ->
        mapTwo.merge(key, value, (value1, value2) ->
          value1.equalsIgnoreCase(value2) ? value1 : value1 + "," + value2));
      System.out.println(mapOne);
    }
}
