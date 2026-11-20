package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void firstExample() {
    assertThat(solution.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.0);
  }

  @Test
  void secondExampleAndMinimumLength() {
    assertThat(solution.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.0);
  }

  @Test
  void preservesFractionalPartAndInput() {
    int[] salary = {1000, 1001, 1002, 1004, 1000000};
    int[] original = salary.clone();
    assertThat(solution.average(salary)).isCloseTo(3007.0 / 3, within(1e-9));
    assertThat(salary).containsExactly(original);
  }

  @Test
  void maximumLengthAndHighValuesWithoutOverflow() {
    int[] salary = IntStream.rangeClosed(999901, 1000000).toArray();
    assertThat(solution.average(salary)).isEqualTo(999950.5);
  }

  @Test
  void descendingInputAndValueLimits() {
    assertThat(solution.average(new int[] {1000000, 500000, 1000})).isEqualTo(500000.0);
  }
}
