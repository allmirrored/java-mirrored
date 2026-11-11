package homework.h11;

// https://leetcode.com/problems/missing-number/
public class T1 {
  public int missingNumber(int[] numbers) {
    int missing = numbers.length;
    for (int i = 0; i < numbers.length; i++) {
      missing ^= i ^ numbers[i];
    }
    return missing;
  }
}
