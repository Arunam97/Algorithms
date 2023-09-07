/*
 * https://leetcode.com/problems/sliding-window-maximum/
 * 
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * Return the max sliding window.
 */
import java.util.*;
public class N0239_SlidingWindowMaximum
{
    // The most optimal solution involves a deque that has not been implemented here.
    // This problem is solved using a straighforward approach.
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int left = 0;
        int right = k - 1;
        int prevMaxIndex = -1;
        int[] output = new int[nums.length - k + 1];
        for (int i = 0 ; i < nums.length - k + 1 ; i++)
        {
            // If our previous max is moving out of the window then find new local max.
            if (prevMaxIndex < left)
            {
                prevMaxIndex = windowMaxIndex(nums, left, right);
            }
            // If shifting the window does not push out the previous max index 
            // then only compare previous max index with the new element now in the window. 
            else
            {
                if (nums[right] >= nums[prevMaxIndex])
                {
                    prevMaxIndex = right;
                }
            }
            output[i] = nums[prevMaxIndex];
            left = left + 1;
            right = right + 1;
        }
        return output;
    }

    // Helper class to find the maximum between 2 indexes of an array.
    private int windowMaxIndex(int[] nums, int left, int right)
    {
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = left ; i <= right ; i++)
        {
            if (nums[i] >= maxValue)
            {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex; 
    }
}
