package homework.h15;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/range-sum-of-bst/
public class T2 {
  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) {
      return 0;
    }
    int sum = 0;
    Deque<TreeNode> pending = new ArrayDeque<>();
    pending.push(root);
    while (!pending.isEmpty()) {
      TreeNode node = pending.pop();
      if (node.val >= low && node.val <= high) {
        sum += node.val;
      }
      if (node.val > low && node.left != null) {
        pending.push(node.left);
      }
      if (node.val < high && node.right != null) {
        pending.push(node.right);
      }
    }
    return sum;
  }
}
