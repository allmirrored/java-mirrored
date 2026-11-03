package homework.h02;

// https://leetcode.com/problems/divide-two-integers/
public class T2 {
  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
    int remainder = dividend;
    if (remainder > 0) remainder = -remainder;
    int negativeDivisor = divisor;
    if (negativeDivisor > 0) negativeDivisor = -negativeDivisor;
    int quotient = 0;
    while (remainder <= negativeDivisor) {
      int value = negativeDivisor;
      int multiple = -1;
      while (value >= (Integer.MIN_VALUE >> 1) && remainder <= value + value) {
        value += value;
        multiple += multiple;
      }
      remainder -= value;
      quotient += multiple;
    }
    if ((dividend < 0) == (divisor < 0)) return -quotient;
    return quotient;
  }
}
