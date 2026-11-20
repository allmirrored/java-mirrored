package homework.h03;

// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
public class T2 {
  public int differenceOfSums(int n, int m) {
    int difference = 0;
    for (int number = 1; number <= n; number++) {
      if (number % m == 0) {
        difference -= number;
      } else {
        difference += number;
      }
    }
    return difference;
  }
}
