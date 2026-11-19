package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import org.junit.jupiter.api.Test;

class T2Test {
  @Test
  void supportsBoundaryValuesAndOneHundredCalls() {
    T2 queue = new T2();
    for (int i = 0; i < 50; i++) {
      queue.push(i % 2 == 0 ? 1 : 9);
    }
    for (int i = 0; i < 50; i++) {
      assertThat(queue.pop()).isEqualTo(i % 2 == 0 ? 1 : 9);
    }
  }

  @Test
  void example() {
    T2 queue = new T2();
    assertThat(queue.empty()).isTrue();
    queue.push(1);
    queue.push(2);
    assertThat(queue.peek()).isEqualTo(1);
    assertThat(queue.pop()).isEqualTo(1);
    assertThat(queue.empty()).isFalse();
    assertThat(queue.pop()).isEqualTo(2);
    assertThat(queue.empty()).isTrue();
  }

  @Test
  void preservesOrderWithBothStacksPopulated() {
    T2 queue = new T2();
    queue.push(1);
    queue.push(2);
    assertThat(queue.pop()).isEqualTo(1);
    queue.push(3);
    assertThat(queue.peek()).isEqualTo(2);
    assertThat(queue.peek()).isEqualTo(2);
    assertThat(queue.pop()).isEqualTo(2);
    assertThat(queue.pop()).isEqualTo(3);
    queue.push(4);
    assertThat(queue.pop()).isEqualTo(4);
    assertThat(queue.empty()).isTrue();
  }

  @Test
  void agreesWithReferenceQueueAcrossMixedOperations() {
    T2 actual = new T2();
    Queue<Integer> expected = new ArrayDeque<>();
    Random random = new Random(232);
    for (int i = 0; i < 100; i++) {
      int operation = expected.isEmpty() ? 0 : random.nextInt(4);
      switch (operation) {
        case 0 -> {
          int value = random.nextInt(9) + 1;
          actual.push(value);
          expected.add(value);
        }
        case 1 -> assertThat(actual.pop()).isEqualTo(expected.remove());
        case 2 -> assertThat(actual.peek()).isEqualTo(expected.element());
        default -> assertThat(actual.empty()).isEqualTo(expected.isEmpty());
      }
    }
  }
}
