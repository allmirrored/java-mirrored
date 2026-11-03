package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void reversesWordsInFirstExample() {
    assertThat(solution.reverseWords("Let's take LeetCode contest"))
        .isEqualTo("s'teL ekat edoCteeL tsetnoc");
  }

  @Test
  void reversesWordsInSecondExample() {
    assertThat(solution.reverseWords("Mr Ding")).isEqualTo("rM gniD");
  }

  @Test
  void preservesSingleCharacter() {
    assertThat(solution.reverseWords("a")).isEqualTo("a");
  }

  @Test
  void preservesSingleCharacterWords() {
    assertThat(solution.reverseWords("a b c")).isEqualTo("a b c");
  }

  @Test
  void reversesEvenAndOddLengthWords() {
    assertThat(solution.reverseWords("abcd abc")).isEqualTo("dcba cba");
  }

  @Test
  void handlesMaximumLengthAndPrintableCharacters() {
    String sentence = "a".repeat(49998) + "!~";
    assertThat(solution.reverseWords(sentence)).isEqualTo("~!" + "a".repeat(49998));
  }
}
