/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index.
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInRotatedSortedArray
{
    public int search(int[] nums, int target) 
    {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) // Using a modified Binary Search to find the pivot index (which will be the smallest element)
        {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[n - 1])
            {
                left = mid + 1; // The left index will keep track of the smallest number i.e, the pivot index
            } 
            else 
            {
                right = mid - 1;
            }
        }
        int answer = binarySearch(nums, target, 0, left - 1); // Run the Binary Search on the left side of the pivot
        if (answer != -1) 
        {
            return answer;
        }
        return binarySearch(nums, target, left, n - 1); // Run the Binary Search on the right side of the pivot
    }
    // Algorithm for a simple binary search.
    private int binarySearch (int[] nums, int target, int left, int right)
    {
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        return -1;
    }
}
