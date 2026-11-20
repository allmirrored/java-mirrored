package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void firstExample() {
    assertThat(solution.differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void secondExample() {
    assertThat(solution.differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void thirdExample() {
    assertThat(solution.differenceOfSums(5, 1)).isEqualTo(-15);
  }

  @Test
  void minimumArguments() {
    assertThat(solution.differenceOfSums(1, 1)).isEqualTo(-1);
    assertThat(solution.differenceOfSums(1, 1000)).isEqualTo(1);
  }

  @Test
  void maximumArguments() {
    assertThat(solution.differenceOfSums(1000, 1000)).isEqualTo(498500);
    assertThat(solution.differenceOfSums(1000, 1)).isEqualTo(-500500);
    assertThat(solution.differenceOfSums(999, 1000)).isEqualTo(499500);
  }

  @Test
  void zeroDifference() {
    assertThat(solution.differenceOfSums(3, 2)).isEqualTo(2);
    assertThat(solution.differenceOfSums(3, 3)).isZero();
  }
}
