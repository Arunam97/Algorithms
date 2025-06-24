import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeDFS {
    // Iterative approach
    public static List<Integer> iterativeDFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            result.add(currentNode.val);

            // Push right child first so left child is processed earlier (for pre-order)
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return result;
    }

    // Recursive approach
    public static List<Integer> recursiveDFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveDFSHelper(root, result);
        return result;
    }

    private static void recursiveDFSHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Pre-order traversal: Process the current node first
        result.add(node.val);
        recursiveDFSHelper(node.left, result);
        recursiveDFSHelper(node.right, result);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
