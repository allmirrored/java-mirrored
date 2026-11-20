package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void firstExample() {
    assertThat(solution.findJudge(2, new int[][] {{1, 2}})).isEqualTo(2);
  }

  @Test
  void secondExample() {
    assertThat(solution.findJudge(3, new int[][] {{1, 3}, {2, 3}})).isEqualTo(3);
  }

  @Test
  void thirdExample() {
    assertThat(solution.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}})).isEqualTo(-1);
  }

  @Test
  void emptyTrustAndSinglePerson() {
    assertThat(solution.findJudge(1, new int[0][2])).isEqualTo(1);
    assertThat(solution.findJudge(1000, new int[0][2])).isEqualTo(-1);
  }

  @Test
  void judgeCanBeFirstPerson() {
    assertThat(solution.findJudge(3, new int[][] {{2, 1}, {3, 1}})).isEqualTo(1);
  }

  @Test
  void maximumTrustLengthAndPopulation() {
    int[][] trust = new int[10_000][2];
    int index = 0;
    for (int person = 1; person < 1000; person++) {
      trust[index++] = new int[] {person, 1000};
    }
    for (int from = 1; index < trust.length; from++) {
      for (int to = 1; to < 1000 && index < trust.length; to++) {
        if (from != to) {
          trust[index++] = new int[] {from, to};
        }
      }
    }
    assertThat(solution.findJudge(1000, trust)).isEqualTo(1000);
  }
}
