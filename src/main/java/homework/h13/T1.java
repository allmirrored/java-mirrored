package homework.h13;

// https://leetcode.com/problems/first-bad-version/
// LeetCode supplies this API through VersionControl; local tests override it.
public abstract class T1 {
  protected abstract boolean isBadVersion(int version);

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
      int middle = left + (right - left) / 2;
      if (isBadVersion(middle)) {
        right = middle;
      } else {
        left = middle + 1;
      }
    }
    return left;
  }
}
