package homework.h11;

// https://leetcode.com/problems/majority-element/
public class T2 {
  public int majorityElement(int[] numbers) {
    int candidate = 0;
    int votes = 0;
    for (int number : numbers) {
      if (votes == 0) {
        candidate = number;
      }
      if (number == candidate) {
        votes++;
      } else {
        votes--;
      }
    }
    return candidate;
  }
}
