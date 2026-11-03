package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void convertsRepeatedSymbolsExample() {
    assertThat(solution.romanToInt("III")).isEqualTo(3);
  }

  @Test
  void convertsAdditiveExample() {
    assertThat(solution.romanToInt("LVIII")).isEqualTo(58);
  }

  @Test
  void convertsSubtractiveExample() {
    assertThat(solution.romanToInt("MCMXCIV")).isEqualTo(1994);
  }

  @Test
  void convertsMinimumValueAndLength() {
    assertThat(solution.romanToInt("I")).isEqualTo(1);
  }

  @Test
  void convertsMaximumValue() {
    assertThat(solution.romanToInt("MMMCMXCIX")).isEqualTo(3999);
  }

  @Test
  void convertsMaximumLength() {
    assertThat(solution.romanToInt("MMMDCCCLXXXVIII")).isEqualTo(3888);
  }

  @Test
  void convertsAllSubtractivePairs() {
    assertThat(solution.romanToInt("IV")).isEqualTo(4);
    assertThat(solution.romanToInt("IX")).isEqualTo(9);
    assertThat(solution.romanToInt("XL")).isEqualTo(40);
    assertThat(solution.romanToInt("XC")).isEqualTo(90);
    assertThat(solution.romanToInt("CD")).isEqualTo(400);
    assertThat(solution.romanToInt("CM")).isEqualTo(900);
  }

  @Test
  void rejectsUnknownSymbol() {
    org.assertj.core.api.Assertions.assertThatThrownBy(() -> solution.romanToInt("A"))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
