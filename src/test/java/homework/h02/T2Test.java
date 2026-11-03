package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void truncatesPositiveExample() {
    assertThat(solution.divide(10, 3)).isEqualTo(3);
  }

  @Test
  void truncatesNegativeExample() {
    assertThat(solution.divide(7, -3)).isEqualTo(-2);
  }

  @Test
  void clampsOverflow() {
    assertThat(solution.divide(Integer.MIN_VALUE, -1)).isEqualTo(Integer.MAX_VALUE);
  }

  @Test
  void preservesMinimumDividend() {
    assertThat(solution.divide(Integer.MIN_VALUE, 1)).isEqualTo(Integer.MIN_VALUE);
  }

  @Test
  void preservesMaximumDividend() {
    assertThat(solution.divide(Integer.MAX_VALUE, 1)).isEqualTo(Integer.MAX_VALUE);
  }

  @Test
  void handlesExtremeDivisors() {
    assertThat(solution.divide(Integer.MIN_VALUE, Integer.MIN_VALUE)).isEqualTo(1);
    assertThat(solution.divide(Integer.MAX_VALUE, Integer.MIN_VALUE)).isZero();
    assertThat(solution.divide(Integer.MIN_VALUE, Integer.MAX_VALUE)).isEqualTo(-1);
    assertThat(solution.divide(Integer.MAX_VALUE, Integer.MAX_VALUE)).isEqualTo(1);
  }

  @Test
  void returnsZeroForZeroDividend() {
    assertThat(solution.divide(0, 1)).isZero();
  }

  @Test
  void handlesBothNegativeOperands() {
    assertThat(solution.divide(-15, -2)).isEqualTo(7);
  }

  @Test
  void handlesNegativeDividend() {
    assertThat(solution.divide(-15, 2)).isEqualTo(-7);
  }

  @Test
  void matchesJavaDivisionAcrossSignedInputs() {
    for (int i = -100; i <= 100; i++) {
      for (int j = -20; j <= 20; j++) {
        if (j != 0) assertThat(solution.divide(i, j)).isEqualTo(i / j);
      }
    }
  }
}
