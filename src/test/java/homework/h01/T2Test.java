package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void computesOverlappingExample() {
    assertThat(solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2)).isEqualTo(45);
  }

  @Test
  void countsIdenticalExampleOnce() {
    assertThat(solution.computeArea(-2, -2, 2, 2, -2, -2, 2, 2)).isEqualTo(16);
  }

  @Test
  void addsHorizontallySeparatedAreas() {
    assertThat(solution.computeArea(0, 0, 1, 1, 2, 0, 3, 1)).isEqualTo(2);
  }

  @Test
  void addsVerticallySeparatedAreas() {
    assertThat(solution.computeArea(0, 0, 1, 1, 0, 2, 1, 3)).isEqualTo(2);
  }

  @Test
  void handlesTouchingEdges() {
    assertThat(solution.computeArea(0, 0, 1, 1, 1, 0, 2, 1)).isEqualTo(2);
  }

  @Test
  void handlesContainedRectangle() {
    assertThat(solution.computeArea(-2, -2, 2, 2, -1, -1, 1, 1)).isEqualTo(16);
  }

  @Test
  void handlesZeroWidthAndHeight() {
    assertThat(solution.computeArea(0, 0, 0, 1, 0, 0, 1, 0)).isZero();
  }

  @Test
  void handlesExtremeCoordinates() {
    assertThat(solution.computeArea(-10000, -10000, 10000, 10000, -10000, -10000, 10000, 10000))
        .isEqualTo(400000000);
  }

  @Test
  void handlesPointsAtCoordinateLimits() {
    assertThat(solution.computeArea(-10000, -10000, -10000, -10000, 10000, 10000, 10000, 10000))
        .isZero();
  }
}
