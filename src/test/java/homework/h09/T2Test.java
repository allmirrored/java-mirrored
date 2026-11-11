package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void matchesFirstExampleIncludingTies() {
    assertThat(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .containsExactly(true, true, true, false, true);
  }

  @Test
  void matchesSecondExampleWithOneExtraCandy() {
    assertThat(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .containsExactly(true, false, false, false, false);
  }

  @Test
  void matchesThirdExampleWithTwoGreatestCounts() {
    assertThat(solution.kidsWithCandies(new int[] {12, 1, 12}, 10))
        .containsExactly(true, false, true);
  }

  @Test
  void handlesMinimumLengthAndCandyCount() {
    assertThat(solution.kidsWithCandies(new int[] {1, 1}, 1)).containsExactly(true, true);
  }

  @Test
  void acceptsExactlyMatchingGreatestCount() {
    assertThat(solution.kidsWithCandies(new int[] {1, 2}, 1)).containsExactly(true, true);
  }

  @Test
  void handlesMaximumExtraCandiesAndValueBoundary() {
    assertThat(solution.kidsWithCandies(new int[] {1, 100}, 50)).containsExactly(false, true);
  }

  @Test
  void handlesMaximumLengthAndMaximumCandyCounts() {
    int[] candies = new int[100];
    Arrays.fill(candies, 100);
    assertThat(solution.kidsWithCandies(candies, 50))
        .containsExactlyElementsOf(Collections.nCopies(100, true));
  }

  @Test
  void findsGreatestCountAtEndWithoutChangingInput() {
    int[] candies = {1, 2, 10};
    assertThat(solution.kidsWithCandies(candies, 1)).containsExactly(false, false, true);
    assertThat(candies).containsExactly(1, 2, 10);
  }
}
