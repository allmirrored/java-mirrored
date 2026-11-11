package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void findsThreeForFirstExample() {
    assertThat(solution.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void findsTwoForSecondExample() {
    assertThat(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void returnsSingleElement() {
    assertThat(solution.majorityElement(new int[] {0})).isZero();
  }

  @Test
  void acceptsMinimumAllowedValue() {
    assertThat(solution.majorityElement(new int[] {-1_000_000_000})).isEqualTo(-1_000_000_000);
  }

  @Test
  void acceptsMaximumAllowedValue() {
    assertThat(solution.majorityElement(new int[] {1_000_000_000})).isEqualTo(1_000_000_000);
  }

  @Test
  void replacesCandidateAfterVotesCancel() {
    assertThat(solution.majorityElement(new int[] {1, 2, 3, 3, 3})).isEqualTo(3);
  }

  @Test
  void handlesBareMajorityAtMaximumLength() {
    int[] numbers = new int[50_000];
    Arrays.fill(numbers, 0, 24_999, -1_000_000_000);
    Arrays.fill(numbers, 24_999, numbers.length, 1_000_000_000);
    assertThat(solution.majorityElement(numbers)).isEqualTo(1_000_000_000);
  }

  @Test
  void preservesInputWithNegativeMajority() {
    int[] numbers = {-7, 2, -7, -7, 3};
    assertThat(solution.majorityElement(numbers)).isEqualTo(-7);
    assertThat(numbers).containsExactly(-7, 2, -7, -7, 3);
  }
}
