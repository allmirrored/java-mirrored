package homework.h02;

// https://leetcode.com/problems/add-binary/
public class T1 {
  public String addBinary(String first, String second) {
    StringBuilder result = new StringBuilder();
    int firstIndex = first.length() - 1;
    int secondIndex = second.length() - 1;
    int carry = 0;
    while (firstIndex >= 0 || secondIndex >= 0 || carry != 0) {
      if (firstIndex >= 0) carry += first.charAt(firstIndex--) - '0';
      if (secondIndex >= 0) carry += second.charAt(secondIndex--) - '0';
      result.append(carry % 2);
      carry /= 2;
    }
    return result.reverse().toString();
  }
}
