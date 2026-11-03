package homework.h04;

// https://leetcode.com/problems/integer-to-roman/
public class T2 {
  public String intToRoman(int number) {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
      while (number >= values[i]) {
        result.append(symbols[i]);
        number -= values[i];
      }
    }
    return result.toString();
  }
}
