/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */
public class RemoveDuplicates
{
    public int removeDuplicates(int[] nums) 
    {
        int j = 1; // 'j' will track the index where a new unique number should be placed
        for (int i = 1 ; i < nums.length ; i++) 
        {
            if (nums[i] != nums[i-1]) // Check if number at index 'i' is unique
            { 
                nums[j] = nums[i]; // If number is unique then assign it to j index, effectively overwriting the older value
                j++;
            }
        }
        return j;
    }
}