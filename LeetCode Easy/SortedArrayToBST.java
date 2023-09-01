/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 */
public class SortedArrayToBST
{
    // Class TreeNode given as part of the question
    public class TreeNode { 
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Driver function for the helper function.
    public TreeNode sortedArrayToBST(int[] nums)
    { 
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper (int[] nums, int start, int end)
    {
        if (start > end) // Incorrect indexes are given.
        {
            return null;
        }
        int mid = (start + end) / 2; // Find the index of the median element.
        TreeNode root = new TreeNode(nums[mid]); // The median element becomes the root node.
        root.left = helper(nums, start, mid - 1); // For the left hand of the root call the helper function between start and mid - 1.
        root.right = helper(nums, mid + 1, end); // For the right hand of the root call the helper function between mid + 1 and end.
        return root;
    }
}
