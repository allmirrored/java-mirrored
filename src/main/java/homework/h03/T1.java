package homework.h03;

// https://leetcode.com/problems/roman-to-integer/
public class T1 {
  public int romanToInt(String roman) {
    int total = 0;
    int previous = 0;
    for (int i = roman.length() - 1; i >= 0; i--) {
      int value =
          switch (roman.charAt(i)) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman numeral");
          };
      if (value < previous) total -= value;
      else total += value;
      previous = value;
    }
    return total;
  }
}
