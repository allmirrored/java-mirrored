package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void convertsUnsignedExample() {
    assertThat(solution.myAtoi("42")).isEqualTo(42);
  }

  @Test
  void convertsNegativeExampleWithSpacesAndZeros() {
    assertThat(solution.myAtoi("   -042")).isEqualTo(-42);
  }

  @Test
  void stopsAtLetterInExample() {
    assertThat(solution.myAtoi("1337c0d3")).isEqualTo(1337);
  }

  @Test
  void stopsAtSignInExample() {
    assertThat(solution.myAtoi("0-1")).isZero();
  }

  @Test
  void returnsZeroForWordsExample() {
    assertThat(solution.myAtoi("words and 987")).isZero();
  }

  @Test
  void returnsZeroForEmptyInput() {
    assertThat(solution.myAtoi("")).isZero();
  }

  @Test
  void returnsZeroForSpacesAndBareSigns() {
    assertThat(solution.myAtoi("   ")).isZero();
    assertThat(solution.myAtoi("+")).isZero();
    assertThat(solution.myAtoi("-")).isZero();
    assertThat(solution.myAtoi("+-12")).isZero();
  }

  @Test
  void readsExplicitPositiveSign() {
    assertThat(solution.myAtoi("+123")).isEqualTo(123);
  }

  @Test
  void acceptsIntegerLimits() {
    assertThat(solution.myAtoi("2147483647")).isEqualTo(Integer.MAX_VALUE);
    assertThat(solution.myAtoi("-2147483648")).isEqualTo(Integer.MIN_VALUE);
  }

  @Test
  void clampsOverflowInBothDirections() {
    assertThat(solution.myAtoi("2147483648")).isEqualTo(Integer.MAX_VALUE);
    assertThat(solution.myAtoi("-2147483649")).isEqualTo(Integer.MIN_VALUE);
  }

  @Test
  void handlesMaximumLength() {
    assertThat(solution.myAtoi("9".repeat(200))).isEqualTo(Integer.MAX_VALUE);
    assertThat(solution.myAtoi("-" + "9".repeat(199))).isEqualTo(Integer.MIN_VALUE);
    assertThat(solution.myAtoi("0".repeat(200))).isZero();
  }

  @Test
  void stopsBeforeDigitRangeOnEitherSide() {
    assertThat(solution.myAtoi("12/34")).isEqualTo(12);
    assertThat(solution.myAtoi("12:34")).isEqualTo(12);
  }
}
