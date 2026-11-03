package homework.h03;

// https://leetcode.com/problems/reverse-integer/
public class T2 {
  public int reverse(int number) {
    int result = 0;
    while (number != 0) {
      int digit = number % 10;
      if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) return 0;
      result = result * 10 + digit;
      number /= 10;
    }
    return result;
  }
}
