package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void reversesPositiveExample() {
    assertThat(solution.reverse(123)).isEqualTo(321);
  }

  @Test
  void reversesNegativeExample() {
    assertThat(solution.reverse(-123)).isEqualTo(-321);
  }

  @Test
  void dropsTrailingZeroInExample() {
    assertThat(solution.reverse(120)).isEqualTo(21);
  }

  @Test
  void returnsZeroForZero() {
    assertThat(solution.reverse(0)).isZero();
  }

  @Test
  void preservesSingleDigit() {
    assertThat(solution.reverse(7)).isEqualTo(7);
  }

  @Test
  void returnsZeroForIntegerLimits() {
    assertThat(solution.reverse(Integer.MIN_VALUE)).isZero();
    assertThat(solution.reverse(Integer.MAX_VALUE)).isZero();
  }

  @Test
  void rejectsPositiveOverflow() {
    assertThat(solution.reverse(1534236469)).isZero();
  }

  @Test
  void rejectsNegativeOverflow() {
    assertThat(solution.reverse(-1563847412)).isZero();
  }

  @Test
  void acceptsValuesNearOverflowThreshold() {
    assertThat(solution.reverse(1463847412)).isEqualTo(2147483641);
    assertThat(solution.reverse(-1463847412)).isEqualTo(-2147483641);
  }
}
