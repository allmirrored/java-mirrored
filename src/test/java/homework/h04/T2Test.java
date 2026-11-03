package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void convertsFirstExample() {
    assertThat(solution.intToRoman(3749)).isEqualTo("MMMDCCXLIX");
  }

  @Test
  void convertsSecondExample() {
    assertThat(solution.intToRoman(58)).isEqualTo("LVIII");
  }

  @Test
  void convertsThirdExample() {
    assertThat(solution.intToRoman(1994)).isEqualTo("MCMXCIV");
  }

  @Test
  void convertsMinimumValue() {
    assertThat(solution.intToRoman(1)).isEqualTo("I");
  }

  @Test
  void convertsMaximumValue() {
    assertThat(solution.intToRoman(3999)).isEqualTo("MMMCMXCIX");
  }

  @Test
  void usesEverySubtractiveSymbol() {
    assertThat(solution.intToRoman(4)).isEqualTo("IV");
    assertThat(solution.intToRoman(9)).isEqualTo("IX");
    assertThat(solution.intToRoman(40)).isEqualTo("XL");
    assertThat(solution.intToRoman(90)).isEqualTo("XC");
    assertThat(solution.intToRoman(400)).isEqualTo("CD");
    assertThat(solution.intToRoman(900)).isEqualTo("CM");
  }

  @Test
  void roundTripsEveryPermittedValue() {
    homework.h03.T1 parser = new homework.h03.T1();
    for (int i = 1; i <= 3999; i++)
      assertThat(parser.romanToInt(solution.intToRoman(i))).isEqualTo(i);
  }
}
