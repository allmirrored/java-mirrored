package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsThreeForFirstExample() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
  }

  @Test
  void returnsTwoForSecondExample() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
  }

  @Test
  void returnsZeroForSingleZero() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {0})).isZero();
  }

  @Test
  void returnsOneForSingleOne() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1})).isEqualTo(1);
  }

  @Test
  void preservesLongestRunBeforeTrailingZeros() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1, 0, 0})).isEqualTo(3);
  }

  @Test
  void resetsRunBetweenGroups() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {0, 1, 1, 0, 1, 1, 0})).isEqualTo(2);
  }

  @Test
  void handlesMaximumLengthOfZeros() {
    assertThat(solution.findMaxConsecutiveOnes(new int[100_000])).isZero();
  }

  @Test
  void handlesMaximumLengthOfOnes() {
    int[] numbers = new int[100_000];
    Arrays.fill(numbers, 1);
    assertThat(solution.findMaxConsecutiveOnes(numbers)).isEqualTo(100_000);
  }
}
