import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeBFS {
    // BFS with Queue and Iterator
    public static List<Integer> iterativeBFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // Initialize queue
        Queue<TreeNode> queue = new LinkedList<>();
        // Add first element
        queue.offer(root);

        while (!queue.isEmpty()) {
            // Get next queue element
            TreeNode currentNode = queue.poll();
            // Do operation
            result.add(currentNode.val);
            // Put left in queue
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            // Put right in queue
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        return result;
    }

    // Recursive approach
    public static List<Integer> recursiveBFS(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        recursiveBFSHelper(queue, result);
        return result;
    }

    private static void recursiveBFSHelper(Queue<TreeNode> queue, List<Integer> result) {
        if (queue.isEmpty()) {
            return;
        }

        TreeNode currentNode = queue.poll();
        result.add(currentNode.val);

        if (currentNode.left != null) {
            queue.offer(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.offer(currentNode.right);
        }

        recursiveBFSHelper(queue, result);
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
