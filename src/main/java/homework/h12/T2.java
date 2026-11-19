package homework.h12;

// https://leetcode.com/problems/relative-sort-array/
public class T2 {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] counts = new int[1001];
    for (int value : arr1) {
      counts[value]++;
    }
    int[] result = new int[arr1.length];
    int index = 0;
    for (int value : arr2) {
      while (counts[value] > 0) {
        result[index++] = value;
        counts[value]--;
      }
    }
    for (int value = 0; value < counts.length; value++) {
      while (counts[value] > 0) {
        result[index++] = value;
        counts[value]--;
      }
    }
    return result;
  }
}
