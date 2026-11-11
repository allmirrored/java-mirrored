package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
  public char kthCharacter(int position) {
    if (position == 1) {
      return 'a';
    }
    int previousLength = Integer.highestOneBit(position - 1);
    return (char) (kthCharacter(position - previousLength) + 1);
  }
}
