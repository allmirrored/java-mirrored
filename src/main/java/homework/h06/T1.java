package homework.h06;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class T1 {
  public String reverseWords(String sentence) {
    char[] letters = sentence.toCharArray();
    int start = 0;
    for (int i = 0; i <= letters.length; i++) {
      if (i == letters.length || letters[i] == ' ') {
        int left = start;
        int right = i - 1;
        while (left < right) {
          char saved = letters[left];
          letters[left++] = letters[right];
          letters[right--] = saved;
        }
        start = i + 1;
      }
    }
    return new String(letters);
  }
}
