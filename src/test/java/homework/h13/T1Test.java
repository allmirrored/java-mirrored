package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private void checkSearch(int n, int bad) {
    int[] calls = {0};
    T1 solution =
        new T1() {
          @Override
          protected boolean isBadVersion(int version) {
            assertThat(version).isBetween(1, n);
            calls[0]++;
            return version >= bad;
          }
        };
    assertThat(solution.firstBadVersion(n)).isEqualTo(bad);
    int limit = 32 - Integer.numberOfLeadingZeros(n - 1);
    assertThat(calls[0]).isLessThanOrEqualTo(limit);
  }

  @Test
  void firstExample() {
    checkSearch(5, 4);
  }

  @Test
  void secondExampleAndMinimum() {
    checkSearch(1, 1);
  }

  @Test
  void firstVersionBadAtMaximumN() {
    checkSearch(Integer.MAX_VALUE, 1);
  }

  @Test
  void lastVersionBadAtMaximumN() {
    checkSearch(Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  @Test
  void avoidsOverflowWhenSearchingUpperHalf() {
    checkSearch(Integer.MAX_VALUE, 2_000_000_000);
  }

  @Test
  void handlesTwoVersions() {
    checkSearch(2, 1);
    checkSearch(2, 2);
  }
}
