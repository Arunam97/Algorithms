/*
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class FirstAndLastPositionInSortedArray
{
    public int[] searchRange(int[] nums, int target) 
    {
        int first = firstOccurence(nums, target);
        int last = lastOccurence(nums, target);
        return new int[] {first, last};
    }
    private int firstOccurence(int[] nums, int target)
    {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            // Because we are trying to find the first occurence and not just any occurence, we check if the target is less or EQUAL, in which case we keeping making our window smaller by moving the right index
            if (target <= nums[mid]) 
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
            if(nums[mid] == target)
            {
                index = mid;
            }
        }
        return index;
    }
    private int lastOccurence(int[] nums, int target)
    {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            // For the last occurence we use greater or EQUAL when moving the left index so that we only get the last occurence and not any occurence
            if (target >= nums[mid]) 
            {
                left = left + 1;
            }
            else
            {
                right = mid - 1;
            }
            if(nums[mid] == target)
            {
                index = mid;
            }
        }
        return index;
    }
}
