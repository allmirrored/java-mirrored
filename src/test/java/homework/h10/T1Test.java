package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsBForFirstExample() {
    assertThat(solution.kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void returnsCForSecondExample() {
    assertThat(solution.kthCharacter(10)).isEqualTo('c');
  }

  @Test
  void returnsAForMinimumPosition() {
    assertThat(solution.kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void handlesMaximumPosition() {
    assertThat(solution.kthCharacter(500)).isEqualTo('h');
  }

  @Test
  void handlesWordDoublingBoundary() {
    assertThat(solution.kthCharacter(256)).isEqualTo('i');
    assertThat(solution.kthCharacter(257)).isEqualTo('b');
  }

  @Test
  void matchesExplicitGameForEveryAllowedPosition() {
    String word = "a";
    while (word.length() < 500) {
      StringBuilder nextPart = new StringBuilder();
      for (int i = 0; i < word.length(); i++) {
        nextPart.append((char) ('a' + (word.charAt(i) - 'a' + 1) % 26));
      }
      word += nextPart;
    }
    for (int i = 1; i <= 500; i++) {
      assertThat(solution.kthCharacter(i)).isEqualTo(word.charAt(i - 1));
    }
  }
}
