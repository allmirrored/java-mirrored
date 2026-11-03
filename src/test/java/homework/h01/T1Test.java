package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void recognizesPositiveExample() {
    assertThat(solution.isPalindrome(121)).isTrue();
  }

  @Test
  void rejectsNegativeExample() {
    assertThat(solution.isPalindrome(-121)).isFalse();
  }

  @Test
  void rejectsTrailingZeroExample() {
    assertThat(solution.isPalindrome(10)).isFalse();
  }

  @Test
  void acceptsZero() {
    assertThat(solution.isPalindrome(0)).isTrue();
  }

  @Test
  void acceptsSingleDigit() {
    assertThat(solution.isPalindrome(7)).isTrue();
  }

  @Test
  void recognizesEvenLengthPalindrome() {
    assertThat(solution.isPalindrome(1221)).isTrue();
  }

  @Test
  void rejectsUnequalHalves() {
    assertThat(solution.isPalindrome(123)).isFalse();
  }

  @Test
  void handlesIntegerLimits() {
    assertThat(solution.isPalindrome(Integer.MIN_VALUE)).isFalse();
    assertThat(solution.isPalindrome(Integer.MAX_VALUE)).isFalse();
    assertThat(solution.isPalindrome(2147447412)).isTrue();
  }
}
