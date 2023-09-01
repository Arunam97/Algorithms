/*
 * https://leetcode.com/problems/missing-number/
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
public class MissingNumber
{
    public int missingNumber(int[] nums) 
    {
        int len = nums.length;
        int sum = (len) * (len + 1) / 2; // n(n+1)/2 to find the sum of the array.
        for (int i = 0 ; i < len ; i++) 
        {
            sum = sum - nums[i]; // Keep subtracting all elements so that only the missing number is left.
        }
        return sum;
    }
}
