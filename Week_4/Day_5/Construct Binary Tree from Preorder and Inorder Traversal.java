import java.util.HashMap;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int start, int end) {

        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);

        int mid = map.get(root.val);

        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);

        return root;
    }
}