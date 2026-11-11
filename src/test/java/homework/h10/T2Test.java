package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void reversesFirstExample() {
    char[] letters = "hello".toCharArray();
    solution.reverseString(letters);
    assertThat(letters).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void reversesSecondExample() {
    char[] letters = "Hannah".toCharArray();
    solution.reverseString(letters);
    assertThat(letters).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void preservesSingleCharacter() {
    char[] letters = {'a'};
    solution.reverseString(letters);
    assertThat(letters).containsExactly('a');
  }

  @Test
  void swapsTwoCharactersInOriginalArray() {
    char[] letters = {'a', 'b'};
    char[] original = letters;
    solution.reverseString(letters);
    assertThat(original).containsExactly('b', 'a');
  }

  @Test
  void handlesPrintableAsciiBoundaries() {
    char[] letters = {' ', '!', '~'};
    solution.reverseString(letters);
    assertThat(letters).containsExactly('~', '!', ' ');
  }

  @Test
  void preservesIdenticalCharacters() {
    char[] letters = "aaaa".toCharArray();
    solution.reverseString(letters);
    assertThat(letters).containsExactly('a', 'a', 'a', 'a');
  }

  @Test
  void reversesMaximumLength() {
    char[] letters = "ab".repeat(50_000).toCharArray();
    solution.reverseString(letters);
    assertThat(letters).containsExactly("ba".repeat(50_000).toCharArray());
  }
}
