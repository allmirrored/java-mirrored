package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void sortsExamples() {
    assertThat(
            solution.relativeSortArray(
                new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[] {2, 1, 4, 3, 9, 6}))
        .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
    assertThat(
            solution.relativeSortArray(new int[] {28, 6, 22, 8, 44, 17}, new int[] {22, 28, 8, 6}))
        .containsExactly(22, 28, 8, 6, 17, 44);
  }

  @Test
  void followsCustomOrderAndSortsRemainingDuplicates() {
    int[] input = {0, 1000, 2, 0, 2, 1, 1000};
    int[] order = {1000, 1};
    int[] original = input.clone();
    assertThat(solution.relativeSortArray(input, order)).containsExactly(1000, 1000, 1, 0, 0, 2, 2);
    assertThat(input).containsExactly(original);
    assertThat(order).containsExactly(1000, 1);
  }

  @Test
  void handlesSingleElement() {
    assertThat(solution.relativeSortArray(new int[] {0}, new int[] {0})).containsExactly(0);
  }

  @Test
  void handlesMaximumLength() {
    int[] input = new int[1000];
    Arrays.fill(input, 1000);
    assertThat(solution.relativeSortArray(input, new int[] {1000})).containsExactly(input);
  }
}
