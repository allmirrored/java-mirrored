package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void firstExample() {
    assertThat(solution.removeDuplicates("abbaca")).isEqualTo("ca");
  }

  @Test
  void secondExample() {
    assertThat(solution.removeDuplicates("azxxzy")).isEqualTo("ay");
  }

  @Test
  void singleAndNoDuplicates() {
    assertThat(solution.removeDuplicates("a")).isEqualTo("a");
    assertThat(solution.removeDuplicates("abcabc")).isEqualTo("abcabc");
  }

  @Test
  void cascadingRemovalsAndOddRun() {
    assertThat(solution.removeDuplicates("abccba")).isEmpty();
    assertThat(solution.removeDuplicates("aaa")).isEqualTo("a");
  }

  @Test
  void maximumLength() {
    assertThat(solution.removeDuplicates("a".repeat(100_000))).isEmpty();
    String alternating = "ab".repeat(50_000);
    assertThat(solution.removeDuplicates(alternating)).isEqualTo(alternating);
  }
}
