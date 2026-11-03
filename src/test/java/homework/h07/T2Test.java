package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void reducesFourteenInSixSteps() {
    assertThat(solution.numberOfSteps(14)).isEqualTo(6);
  }

  @Test
  void reducesEightInFourSteps() {
    assertThat(solution.numberOfSteps(8)).isEqualTo(4);
  }

  @Test
  void reducesExampleWithOneHundredTwentyThree() {
    assertThat(solution.numberOfSteps(123)).isEqualTo(12);
  }

  @Test
  void returnsZeroForZero() {
    assertThat(solution.numberOfSteps(0)).isZero();
  }

  @Test
  void reducesOneInOneStep() {
    assertThat(solution.numberOfSteps(1)).isEqualTo(1);
  }

  @Test
  void reducesMaximumInputInTwentySixSteps() {
    assertThat(solution.numberOfSteps(1_000_000)).isEqualTo(26);
  }
}
