package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void firstExample() {
    int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    assertThat(solution.floodFill(image, 1, 1, 2)).isSameAs(image);
    assertThat(image).isDeepEqualTo(new int[][] {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}});
  }

  @Test
  void secondExample() {
    int[][] image = {{0, 0, 0}, {0, 0, 0}};
    assertThat(solution.floodFill(image, 0, 0, 0))
        .isDeepEqualTo(new int[][] {{0, 0, 0}, {0, 0, 0}});
  }

  @Test
  void singlePixelAndMaximumColor() {
    assertThat(solution.floodFill(new int[][] {{0}}, 0, 0, 65535))
        .isDeepEqualTo(new int[][] {{65535}});
    assertThat(solution.floodFill(new int[][] {{65535}}, 0, 0, 0)).isDeepEqualTo(new int[][] {{0}});
  }

  @Test
  void doesNotCrossDiagonalOrOtherColors() {
    int[][] image = {{1, 0}, {0, 1}};
    assertThat(solution.floodFill(image, 0, 0, 2)).isDeepEqualTo(new int[][] {{2, 0}, {0, 1}});
  }

  @Test
  void maximumImageFromLastPixel() {
    int[][] image = new int[50][50];
    solution.floodFill(image, 49, 49, 65535);
    for (int[] row : image) {
      int[] expected = new int[50];
      Arrays.fill(expected, 65535);
      assertThat(row).containsExactly(expected);
    }
  }

  @Test
  void singleRowAndSingleColumn() {
    assertThat(solution.floodFill(new int[][] {{1, 1, 0}}, 0, 1, 2))
        .isDeepEqualTo(new int[][] {{2, 2, 0}});
    assertThat(solution.floodFill(new int[][] {{1}, {1}, {0}}, 1, 0, 2))
        .isDeepEqualTo(new int[][] {{2}, {2}, {0}});
  }
}
