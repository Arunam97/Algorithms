/*
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * 
 * Given an array of positive integers nums and a positive integer target, 
 * return the minimal length of a subarray whose sum is greater than or equal to target. 
 * If there is no such subarray, return 0 instead.
 */
public class N0209_MinimumSizeSubarraySum
{
    // This problem has been solved using a Sliding Window solution.
    public int minSubArrayLen(int target, int[] nums) 
    {
        int left = 0;
        int right = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while (right < nums.length)
        {
            // Add the element at the right index to window.
            sum = sum + nums[right];
            // Check if window is valid.
            while (sum >= target)
            {
                // If window is not valid then shift left index 1 step forward.
                result = Math.min(result, right - left + 1);
                sum = sum - nums[left];
                left = left + 1;
            }
            right = right + 1;
        }
        if (result == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return result;
        }
    }
}
