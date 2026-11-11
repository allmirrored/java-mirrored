package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void findsTwoForFirstExample() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void findsUpperBoundaryForSecondExample() {
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void findsEightForThirdExample() {
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void findsOneForSingleZero() {
    assertThat(solution.missingNumber(new int[] {0})).isEqualTo(1);
  }

  @Test
  void findsZeroForSingleOne() {
    assertThat(solution.missingNumber(new int[] {1})).isZero();
  }

  @Test
  void findsZeroAtMaximumLength() {
    int[] numbers = IntStream.rangeClosed(1, 10_000).toArray();
    assertThat(solution.missingNumber(numbers)).isZero();
  }

  @Test
  void findsMaximumAllowedValueAtMaximumLength() {
    int[] numbers = IntStream.range(0, 10_000).toArray();
    assertThat(solution.missingNumber(numbers)).isEqualTo(10_000);
  }

  @Test
  void findsInteriorValueAtMaximumLengthWithoutChangingInput() {
    int[] numbers = IntStream.rangeClosed(0, 10_000).filter(value -> value != 5000).toArray();
    int[] original = numbers.clone();
    assertThat(solution.missingNumber(numbers)).isEqualTo(5000);
    assertThat(numbers).containsExactly(original);
  }
}
