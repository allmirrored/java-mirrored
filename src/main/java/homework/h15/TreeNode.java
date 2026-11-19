package homework.h15;

// Local equivalent of the TreeNode supplied by LeetCode for both tree tasks.
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int val) {
    this(val, null, null);
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
