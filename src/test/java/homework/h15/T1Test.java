package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void firstExample() {
    TreeNode root =
        new TreeNode(
            4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9)));
    assertThat(solution.invertTree(root)).isSameAs(root);
    assertThat(root.left.val).isEqualTo(7);
    assertThat(root.right.val).isEqualTo(2);
    assertThat(root.left.left.val).isEqualTo(9);
    assertThat(root.left.right.val).isEqualTo(6);
    assertThat(root.right.left.val).isEqualTo(3);
    assertThat(root.right.right.val).isEqualTo(1);
  }

  @Test
  void secondExample() {
    TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    solution.invertTree(root);
    assertThat(root.left.val).isEqualTo(3);
    assertThat(root.right.val).isEqualTo(1);
  }

  @Test
  void thirdExample() {
    assertThat(solution.invertTree(null)).isNull();
  }

  @Test
  void singleNodeAndBoundaryValues() {
    TreeNode root = new TreeNode(-100);
    assertThat(solution.invertTree(root)).isSameAs(root);
    assertThat(root.val).isEqualTo(-100);
    assertThat(root.left).isNull();
    assertThat(root.right).isNull();
    assertThat(solution.invertTree(new TreeNode(100)).val).isEqualTo(100);
  }

  @Test
  void maximumLengthChainAndInvertingTwice() {
    TreeNode root = new TreeNode(0);
    TreeNode node = root;
    for (int i = 1; i < 100; i++) {
      node.left = new TreeNode(i);
      node = node.left;
    }
    solution.invertTree(root);
    node = root;
    for (int i = 0; i < 100; i++) {
      assertThat(node.val).isEqualTo(i);
      assertThat(node.left).isNull();
      node = node.right;
    }
    assertThat(node).isNull();
    solution.invertTree(root);
    assertThat(root.left.val).isEqualTo(1);
    assertThat(root.right).isNull();
  }
}
