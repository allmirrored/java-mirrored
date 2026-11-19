package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void firstExample() {
    TreeNode root =
        new TreeNode(
            10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18)));
    assertThat(solution.rangeSumBST(root, 7, 15)).isEqualTo(32);
  }

  @Test
  void secondExample() {
    TreeNode root =
        new TreeNode(
            10,
            new TreeNode(
                5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
            new TreeNode(15, new TreeNode(13), new TreeNode(18)));
    assertThat(solution.rangeSumBST(root, 6, 10)).isEqualTo(23);
  }

  @Test
  void inclusiveSingleNodeAndBoundaryRanges() {
    assertThat(solution.rangeSumBST(new TreeNode(1), 1, 1)).isEqualTo(1);
    assertThat(solution.rangeSumBST(new TreeNode(100_000), 100_000, 100_000)).isEqualTo(100_000);
    assertThat(solution.rangeSumBST(new TreeNode(5), 6, 7)).isZero();
    assertThat(solution.rangeSumBST(new TreeNode(5), 1, 4)).isZero();
    assertThat(solution.rangeSumBST(null, 1, 1)).isZero();
  }

  @Test
  void maximumRightSkewedTreeDoesNotOverflowCallStack() {
    TreeNode root = new TreeNode(80_001);
    TreeNode node = root;
    for (int value = 80_002; value <= 100_000; value++) {
      node.right = new TreeNode(value);
      node = node.right;
    }
    assertThat(solution.rangeSumBST(root, 1, 100_000)).isEqualTo(1_800_010_000);
    assertThat(root.right.val).isEqualTo(80_002);
    assertThat(solution.rangeSumBST(root, 100_000, 100_000)).isEqualTo(100_000);
  }

  @Test
  void leftSkewedTree() {
    TreeNode root = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null);
    assertThat(solution.rangeSumBST(root, 1, 2)).isEqualTo(3);
  }
}
