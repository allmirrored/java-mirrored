package homework.h06;

// https://leetcode.com/problems/string-to-integer-atoi/
public class T2 {
  public int myAtoi(String text) {
    int index = 0;
    while (index < text.length() && text.charAt(index) == ' ') index++;
    int sign = 1;
    if (index < text.length() && (text.charAt(index) == '+' || text.charAt(index) == '-')) {
      if (text.charAt(index) == '-') sign = -1;
      index++;
    }
    int result = 0;
    while (index < text.length() && text.charAt(index) >= '0' && text.charAt(index) <= '9') {
      int digit = text.charAt(index++) - '0';
      if (result > (Integer.MAX_VALUE - digit) / 10) {
        if (sign == 1) return Integer.MAX_VALUE;
        return Integer.MIN_VALUE;
      }
      result = result * 10 + digit;
    }
    return sign * result;
  }
}
