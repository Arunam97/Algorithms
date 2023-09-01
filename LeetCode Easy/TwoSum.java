/*
 * https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers 'nums' and an integer 'target', return indices of the two numbers such that they add up to target.
 */
import java.util.*;
class TwoSum 
{
    public int[] TwoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i = 0 ; i < size ; i++) 
        {
            int complement = target - nums[i]; // Find the complement of the current element.
            if (map.containsKey(complement)) // Check if that complement exists in our map.
            {
                return new int[] {map.get(complement), i}; // If complement exists, return both current index and complement's index.
            }
            map.put(nums[i], i); // If complement was not in the map, then enter the current number and its index as key-value pair.
        }
        return new int[] {}; // No solution found.
    }
}