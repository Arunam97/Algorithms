/*
 * https://leetcode.com/problems/rotate-array/
 * 
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
// NOTE: The most efficient solution to this problem is a 2 pointer solution that has not been implemented here
public class RotateArray
{
    public void rotate(int[] nums, int k) 
    {
        int len = nums.length;
        int[] output = new int[nums.length];
        for (int i = 0 ; i < len ; i++)
        {
            int shift = (i + k) % len; // Doing % len allows us to get an index within the range of 0 and len.
            output[shift] = nums[i];
        }
        for (int i = 0 ; i < len ; i++) // Copy back into the original array.
        {
            nums[i] = output[i];
        }
    }
}
