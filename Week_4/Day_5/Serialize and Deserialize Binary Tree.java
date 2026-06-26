import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Codec {

    public String serialize(TreeNode root) {

        if (root == null) {
            return "null,";
        }

        return root.val + "," +
                serialize(root.left) +
                serialize(root.right);
    }

    public TreeNode deserialize(String data) {

        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));

        return build(q);
    }

    private TreeNode build(Queue<String> q) {

        String value = q.poll();

        if (value.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));

        node.left = build(q);
        node.right = build(q);

        return node;
    }
}