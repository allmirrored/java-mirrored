package homework.h12;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class T1 {
  public int heightChecker(int[] heights) {
    int[] expected = heights.clone();
    Arrays.sort(expected);
    int mismatches = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != expected[i]) {
        mismatches++;
      }
    }
    return mismatches;
  }
}
