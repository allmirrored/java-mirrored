package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void rotatesThreeByThreeExample() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    solution.rotate(matrix);
    assertThat(matrix).isDeepEqualTo(new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
  }

  @Test
  void rotatesFourByFourExample() {
    int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    solution.rotate(matrix);
    assertThat(matrix)
        .isDeepEqualTo(new int[][] {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}});
  }

  @Test
  void preservesSingleElement() {
    int[][] matrix = {{-1000}};
    solution.rotate(matrix);
    assertThat(matrix).isDeepEqualTo(new int[][] {{-1000}});
  }

  @Test
  void rotatesMaximumSizeWithBoundaryValuesInPlace() {
    int[][] matrix = new int[20][20];
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) matrix[i][j] = i * 20 + j;
    }
    matrix[0][0] = -1000;
    matrix[19][19] = 1000;
    int[][] expected = new int[20][20];
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) expected[j][19 - i] = matrix[i][j];
    }
    int[][] original = matrix;
    solution.rotate(matrix);
    assertThat(matrix).isSameAs(original).isDeepEqualTo(expected);
  }
}
