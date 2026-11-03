package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void incrementsFirstExample() {
    assertThat(solution.plusOne(new int[] {1, 2, 3})).containsExactly(1, 2, 4);
  }

  @Test
  void incrementsSecondExample() {
    assertThat(solution.plusOne(new int[] {4, 3, 2, 1})).containsExactly(4, 3, 2, 2);
  }

  @Test
  void expandsSingleNineExample() {
    assertThat(solution.plusOne(new int[] {9})).containsExactly(1, 0);
  }

  @Test
  void incrementsZero() {
    assertThat(solution.plusOne(new int[] {0})).containsExactly(1);
  }

  @Test
  void propagatesPartialCarry() {
    assertThat(solution.plusOne(new int[] {1, 9, 9})).containsExactly(2, 0, 0);
  }

  @Test
  void incrementsMaximumLengthAndDigits() {
    int[] digits = new int[100];
    java.util.Arrays.fill(digits, 9);
    int[] expected = new int[101];
    expected[0] = 1;
    assertThat(solution.plusOne(digits)).containsExactly(expected);
  }

  @Test
  void preservesMaximumLengthWithoutCarry() {
    int[] digits = new int[100];
    digits[0] = 1;
    int[] expected = digits.clone();
    expected[99] = 1;
    assertThat(solution.plusOne(digits)).containsExactly(expected);
  }
}
