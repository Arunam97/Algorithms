/*
 * https://leetcode.com/problems/trapping-rain-water/
 * 
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it can trap after raining.
 */
public class N0042_TrappingRainWater
{
    // This problem is solved using a Two Pointer solution.
    public int trap(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left < right)
        {
            if (height[left] < height[right])
            {
                if (height[left] >= leftMax)
                {
                    leftMax = height[left];
                }
                else
                {
                    water = water + leftMax - height[left];
                }
                left = left + 1;
            }
            else
            {
                if (height[right] >= rightMax)
                {
                    rightMax = height[right];
                }
                else
                {
                    water = water + rightMax - height[right];
                }
                right = right - 1;
            }
        }
        return water;  
    }
}
