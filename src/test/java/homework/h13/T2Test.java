package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void firstExample() {
    assertThat(solution.maximumCount(new int[] {-2, -1, -1, 1, 2, 3})).isEqualTo(3);
  }

  @Test
  void secondExample() {
    assertThat(solution.maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
  }

  @Test
  void thirdExample() {
    assertThat(solution.maximumCount(new int[] {5, 20, 66, 1314})).isEqualTo(4);
  }

  @Test
  void handlesSingleElements() {
    assertThat(solution.maximumCount(new int[] {-2000})).isEqualTo(1);
    assertThat(solution.maximumCount(new int[] {0})).isZero();
    assertThat(solution.maximumCount(new int[] {2000})).isEqualTo(1);
  }

  @Test
  void handlesAllZeroAtMaximumLength() {
    assertThat(solution.maximumCount(new int[2000])).isZero();
  }

  @Test
  void handlesAllNegativeAtMaximumLength() {
    int[] nums = new int[2000];
    Arrays.fill(nums, -2000);
    assertThat(solution.maximumCount(nums)).isEqualTo(2000);
  }

  @Test
  void handlesAllPositiveAtMaximumLength() {
    int[] nums = new int[2000];
    Arrays.fill(nums, 2000);
    assertThat(solution.maximumCount(nums)).isEqualTo(2000);
  }

  @Test
  void positiveMajorityWithZerosAndPreservesInput() {
    int[] nums = {-2000, 0, 0, 1, 1, 2000};
    int[] original = nums.clone();
    assertThat(solution.maximumCount(nums)).isEqualTo(3);
    assertThat(nums).containsExactly(original);
  }
}
