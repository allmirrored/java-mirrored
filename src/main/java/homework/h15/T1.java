package homework.h15;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/invert-binary-tree/
public class T1 {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    Deque<TreeNode> pending = new ArrayDeque<>();
    pending.push(root);
    while (!pending.isEmpty()) {
      TreeNode node = pending.pop();
      TreeNode saved = node.left;
      node.left = node.right;
      node.right = saved;
      if (node.left != null) {
        pending.push(node.left);
      }
      if (node.right != null) {
        pending.push(node.right);
      }
    }
    return root;
  }
}
