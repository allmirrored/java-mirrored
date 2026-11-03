package homework.h08;

import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class T2 {
  public int countPairs(List<Integer> numbers, int target) {
    int pairCount = 0;
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        if (numbers.get(i) + numbers.get(j) < target) {
          pairCount++;
        }
      }
    }
    return pairCount;
  }
}
