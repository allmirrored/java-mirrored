package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void countsFourPairsForFirstExample() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void countsSixPairsForSecondExample() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
  }

  @Test
  void returnsZeroForThirdExample() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3})).isZero();
  }

  @Test
  void returnsZeroForSingleMinimumValue() {
    assertThat(solution.numIdenticalPairs(new int[] {1})).isZero();
  }

  @Test
  void handlesMaximumLengthAndValue() {
    int[] numbers = new int[100];
    Arrays.fill(numbers, 100);
    assertThat(solution.numIdenticalPairs(numbers)).isEqualTo(4950);
  }

  @Test
  void handlesMaximumLengthWithDistinctValues() {
    int[] numbers = new int[100];
    for (int i = 0; i < numbers.length; i++) numbers[i] = i + 1;
    assertThat(solution.numIdenticalPairs(numbers)).isZero();
  }

  @Test
  void countsPairsAtBothValueBoundariesWithoutChangingInput() {
    int[] numbers = {1, 100, 1, 100};
    assertThat(solution.numIdenticalPairs(numbers)).isEqualTo(2);
    assertThat(numbers).containsExactly(1, 100, 1, 100);
  }

  @Test
  void keepsCallsIndependent() {
    assertThat(solution.numIdenticalPairs(new int[] {5, 5})).isEqualTo(1);
    assertThat(solution.numIdenticalPairs(new int[] {5})).isZero();
  }
}
