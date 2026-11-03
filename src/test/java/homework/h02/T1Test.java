package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void addsFirstExampleWithCarry() {
    assertThat(solution.addBinary("11", "1")).isEqualTo("100");
  }

  @Test
  void addsSecondExample() {
    assertThat(solution.addBinary("1010", "1011")).isEqualTo("10101");
  }

  @Test
  void addsZeros() {
    assertThat(solution.addBinary("0", "0")).isEqualTo("0");
  }

  @Test
  void handlesLongerSecondOperand() {
    assertThat(solution.addBinary("1", "111")).isEqualTo("1000");
  }

  @Test
  void addsWithoutCarry() {
    assertThat(solution.addBinary("10", "1")).isEqualTo("11");
  }

  @Test
  void handlesMaximumLengthsAndCarryChain() {
    assertThat(solution.addBinary("1".repeat(10000), "1".repeat(10000)))
        .isEqualTo("1".repeat(10000) + "0");
    assertThat(solution.addBinary("1".repeat(10000), "1")).isEqualTo("1" + "0".repeat(10000));
  }
}
