package homework.h07;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class T2 {
  public int numberOfSteps(int number) {
    int steps = 0;
    while (number > 0) {
      if (number % 2 == 0) {
        number /= 2;
      } else {
        number--;
      }
      steps++;
    }
    return steps;
  }
}
