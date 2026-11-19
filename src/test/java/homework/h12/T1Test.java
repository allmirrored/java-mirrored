package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void countsMismatchesInExamples() {
    assertThat(solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
    assertThat(solution.heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
    assertThat(solution.heightChecker(new int[] {1, 2, 3, 4, 5})).isZero();
  }

  @Test
  void handlesSingleAndEqualHeights() {
    assertThat(solution.heightChecker(new int[] {100})).isZero();
    assertThat(solution.heightChecker(new int[] {1, 1, 1})).isZero();
  }

  @Test
  void handlesMaximumLengthAndPreservesInput() {
    int[] heights = new int[100];
    for (int i = 0; i < heights.length; i++) {
      heights[i] = 100 - i;
    }
    int[] original = heights.clone();
    assertThat(solution.heightChecker(heights)).isEqualTo(100);
    assertThat(heights).containsExactly(original);
  }
}
