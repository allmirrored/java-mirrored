package homework.h14;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class T1 {
  public String removeDuplicates(String s) {
    char[] stack = new char[s.length()];
    int size = 0;
    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (size > 0 && stack[size - 1] == current) {
        size--;
      } else {
        stack[size++] = current;
      }
    }
    return new String(stack, 0, size);
  }
}
