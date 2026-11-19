package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/implement-queue-using-stacks/
// Rename T2 and its constructor to MyQueue when submitting to LeetCode.
public class T2 {
  private final Deque<Integer> incoming = new ArrayDeque<>();
  private final Deque<Integer> outgoing = new ArrayDeque<>();

  public T2() {}

  public void push(int x) {
    incoming.push(x);
  }

  public int pop() {
    transferIfNeeded();
    return outgoing.pop();
  }

  public int peek() {
    transferIfNeeded();
    return outgoing.peek();
  }

  public boolean empty() {
    return incoming.isEmpty() && outgoing.isEmpty();
  }

  private void transferIfNeeded() {
    if (outgoing.isEmpty()) {
      while (!incoming.isEmpty()) {
        outgoing.push(incoming.pop());
      }
    }
  }
}
