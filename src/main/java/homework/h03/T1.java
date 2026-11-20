package homework.h03;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {
  public double average(int[] salary) {
    int minimum = Integer.MAX_VALUE;
    int maximum = Integer.MIN_VALUE;
    int total = 0;
    for (int value : salary) {
      minimum = Math.min(minimum, value);
      maximum = Math.max(maximum, value);
      total += value;
    }
    return (double) (total - minimum - maximum) / (salary.length - 2);
  }
}
