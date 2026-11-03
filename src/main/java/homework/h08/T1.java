package homework.h08;

// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {
  public int findMaxConsecutiveOnes(int[] numbers) {
    int longestRun = 0;
    int currentRun = 0;
    for (int number : numbers) {
      if (number == 1) {
        currentRun++;
        longestRun = Math.max(longestRun, currentRun);
      } else {
        currentRun = 0;
      }
    }
    return longestRun;
  }
}
