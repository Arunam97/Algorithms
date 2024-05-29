/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Solution: Two Pointer.
 */

public class N0026_RemoveDuplicates
{
    public int removeDuplicates(int[] nums) 
    {
        int insertAt = 1; // 'insertAt' will track the index where a new unique number should be placed.
        for (int i = 1 ; i < nums.length ; i++) 
        {
            if (nums[i] != nums[i - 1]) // Check if number at index 'i' is unique.
            { 
                nums[insertAt] = nums[i]; // If number is unique then assign it to `insertAt` index, effectively overwriting the older value.
                insertAt++;
            }
        }
        return insertAt;
    }
}