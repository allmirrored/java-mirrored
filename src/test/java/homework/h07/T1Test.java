package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsFizzForExampleWithThreeNumbers() {
    assertThat(solution.fizzBuzz(3)).containsExactly("1", "2", "Fizz");
  }

  @Test
  void returnsBuzzForExampleWithFiveNumbers() {
    assertThat(solution.fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void returnsFizzBuzzForExampleWithFifteenNumbers() {
    assertThat(solution.fizzBuzz(15))
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }

  @Test
  void returnsOneForMinimumInput() {
    assertThat(solution.fizzBuzz(1)).containsExactly("1");
  }

  @Test
  void returnsEveryEntryForMaximumInput() {
    var answer = solution.fizzBuzz(10_000);
    assertThat(answer).hasSize(10_000);
    for (int i = 1; i <= answer.size(); i++) {
      String expected = "";
      if (i % 3 == 0) expected += "Fizz";
      if (i % 5 == 0) expected += "Buzz";
      if (expected.isEmpty()) expected = Integer.toString(i);
      assertThat(answer.get(i - 1)).isEqualTo(expected);
    }
  }
}
