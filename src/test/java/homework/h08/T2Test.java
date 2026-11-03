package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void countsThreePairsForFirstExample() {
    assertThat(solution.countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
  }

  @Test
  void countsTenPairsForSecondExample() {
    assertThat(solution.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
  }

  @Test
  void returnsZeroForSingleElement() {
    assertThat(solution.countPairs(List.of(1), 50)).isZero();
  }

  @Test
  void excludesSumEqualToTarget() {
    assertThat(solution.countPairs(List.of(-1, 1), 0)).isZero();
  }

  @Test
  void countsDistinctIndexPairsForDuplicateValues() {
    assertThat(solution.countPairs(List.of(1, 1, 1), 3)).isEqualTo(3);
  }

  @Test
  void excludesSumsAboveTarget() {
    assertThat(solution.countPairs(List.of(2, 3, 4), 1)).isZero();
  }

  @Test
  void handlesMinimumValuesAndTargetAtMaximumLength() {
    assertThat(solution.countPairs(Collections.nCopies(50, -50), -50)).isEqualTo(1225);
  }

  @Test
  void handlesMaximumValuesAndTargetAtMaximumLength() {
    assertThat(solution.countPairs(Collections.nCopies(50, 50), 50)).isZero();
  }

  @Test
  void leavesInputOrderUnchanged() {
    List<Integer> numbers = List.of(3, -1, 2);
    assertThat(solution.countPairs(numbers, 3)).isEqualTo(2);
    assertThat(numbers).containsExactly(3, -1, 2);
  }
}
