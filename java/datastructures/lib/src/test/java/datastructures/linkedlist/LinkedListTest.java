package datastructures.linkedlist;

import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void addAString()
    {
      LinkedList sut = new LinkedList();

      sut.add("maddie");
      sut.add("lincoln");
      sut.add("truman");

    assertTrue(sut.lincoln.contains("maddie"));
    assertFalse(sut.lincoln.contains("sage"));
    }

    @Test void searchAstring() {
    LinkedList classToSearch = new LinkedList();

      java.util.LinkedList<String> test = new java.util.LinkedList<>();

      test.add("truman");
      test.add("maddie");
      test.add("lincoln");

    assertTrue(classToSearch.includes(test,"truman"));
    assertFalse(classToSearch.includes(test, "sage"));

    }

    @Test void stringify(){
      LinkedList classToSearch = new LinkedList();

      java.util.LinkedList<String> test = new java.util.LinkedList<>();
      test.add("truman");
      test.add("lincoln");
      test.add("eleanor");
      test.add("maddie");

      String checker = classToSearch.toStringify(test);

      assertTrue(checker.contains("maddie"));
    }
}
