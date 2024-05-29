/*
 * https://leetcode.com/problems/move-zeroes/
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Solution: Two Pointer.
 */

public class N0283_MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        if (nums == null || nums.length == 0) 
        {
            return;
        }
        int insert = 0;
        for (int num : nums) // Go through the entire array,
        {
            if (num != 0) // And if the number is not 0,
            {
                nums[insert] = num; // Then assign it at 'insert' index.
                insert = insert + 1; // Increase 'insert' by 1.
            }
        }        
        while (insert < nums.length) // Once all non-zero elements are placed,
        {
            nums[insert] = 0; // Every remaining index will be zero.
            insert = insert + 1;
        }
    }
}
