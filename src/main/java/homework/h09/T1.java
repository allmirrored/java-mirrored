package homework.h09;

// https://leetcode.com/problems/number-of-good-pairs/
public class T1 {
  public int numIdenticalPairs(int[] numbers) {
    int[] frequencies = new int[101];
    int pairCount = 0;
    for (int number : numbers) {
      pairCount += frequencies[number];
      frequencies[number]++;
    }
    return pairCount;
  }
}
