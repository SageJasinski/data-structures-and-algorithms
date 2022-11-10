package brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

  static boolean areBracketsBalanced(String expression) {
    Deque<Character> stack
      = new ArrayDeque<Character>();

    for (int i = 0; i < expression.length(); i++) {
      char x = expression.charAt(i);

      if (x == '(' || x == '[' || x == '{') {
        stack.push(x);
        continue;
      }

      if (stack.isEmpty())
        return false;
      char current;
      switch (x) {
        case ')' -> {
          current = stack.pop();
          if (current == '{' || current == '[')
            return false;
        }
        case '}' -> {
          current = stack.pop();
          if (current == '(' || current == '[')
            return false;
        }
        case ']' -> {
          current = stack.pop();
          if (current == '(' || current == '{')
            return false;
        }
      }
    }
    return (stack.isEmpty());
  }
}

