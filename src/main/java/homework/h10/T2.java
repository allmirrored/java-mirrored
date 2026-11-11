package homework.h10;

// https://leetcode.com/problems/reverse-string/
public class T2 {
  public void reverseString(char[] letters) {
    int left = 0;
    int right = letters.length - 1;
    while (left < right) {
      char saved = letters[left];
      letters[left] = letters[right];
      letters[right] = saved;
      left++;
      right--;
    }
  }
}
