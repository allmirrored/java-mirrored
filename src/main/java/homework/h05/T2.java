package homework.h05;

// https://leetcode.com/problems/rotate-image/
public class T2 {
  public void rotate(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix.length; j++) {
        int saved = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = saved;
      }
      for (int j = 0; j < matrix.length / 2; j++) {
        int saved = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length - 1 - j];
        matrix[i][matrix.length - 1 - j] = saved;
      }
    }
  }
}
