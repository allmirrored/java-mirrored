package homework.h05;

// https://leetcode.com/problems/longest-common-prefix/
public class T1 {
  public String longestCommonPrefix(String[] words) {
    String prefix = words[0];
    for (int i = 1; i < words.length; i++) {
      while (!words[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    return prefix;
  }
}
