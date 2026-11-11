package homework.h09;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class T2 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatestCount = findGreatestCount(candies);
    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candyCount : candies) {
      result.add(candyCount + extraCandies >= greatestCount);
    }
    return result;
  }

  private int findGreatestCount(int[] candies) {
    int greatestCount = candies[0];
    for (int candyCount : candies) {
      greatestCount = Math.max(greatestCount, candyCount);
    }
    return greatestCount;
  }
}
