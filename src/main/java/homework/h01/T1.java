package homework.h01;

// https://leetcode.com/problems/palindrome-number/
public class T1 {
  public boolean isPalindrome(int number) {
    if (number < 0 || (number != 0 && number % 10 == 0)) return false;
    int reversedHalf = 0;
    while (number > reversedHalf) {
      reversedHalf = reversedHalf * 10 + number % 10;
      number /= 10;
    }
    return number == reversedHalf || number == reversedHalf / 10;
  }
}
