package homework.h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {
  public int maximumCount(int[] nums) {
    int negatives = lowerBound(nums, 0);
    int positives = nums.length - lowerBound(nums, 1);
    return Math.max(negatives, positives);
  }

  private int lowerBound(int[] nums, int target) {
    int left = 0;
    int right = nums.length;
    while (left < right) {
      int middle = left + (right - left) / 2;
      if (nums[middle] < target) {
        left = middle + 1;
      } else {
        right = middle;
      }
    }
    return left;
  }
}
