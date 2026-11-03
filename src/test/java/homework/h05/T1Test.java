package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void findsPrefixInFirstExample() {
    assertThat(solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}))
        .isEqualTo("fl");
  }

  @Test
  void returnsEmptyForSecondExample() {
    assertThat(solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"})).isEmpty();
  }

  @Test
  void returnsSingleWord() {
    assertThat(solution.longestCommonPrefix(new String[] {"alone"})).isEqualTo("alone");
  }

  @Test
  void handlesEmptyWord() {
    assertThat(solution.longestCommonPrefix(new String[] {""})).isEmpty();
  }

  @Test
  void handlesEmptyWordAfterNonemptyWord() {
    assertThat(solution.longestCommonPrefix(new String[] {"abc", ""})).isEmpty();
  }

  @Test
  void handlesEmptyFirstWord() {
    assertThat(solution.longestCommonPrefix(new String[] {"", "abc"})).isEmpty();
  }

  @Test
  void retainsIdenticalPrefix() {
    assertThat(solution.longestCommonPrefix(new String[] {"ab", "ab"})).isEqualTo("ab");
  }

  @Test
  void handlesMaximumWordCountAndLength() {
    String[] words = new String[200];
    java.util.Arrays.fill(words, "a".repeat(200));
    assertThat(solution.longestCommonPrefix(words)).isEqualTo("a".repeat(200));
  }
}
