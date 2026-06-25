import javax.swing.tree.TreeNode;

class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        calculate(root);

        return maxSum;
    }

    private int calculate(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = Math.max(0, calculate(node.left));
        int right = Math.max(0, calculate(node.right));

        maxSum = Math.max(maxSum, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}