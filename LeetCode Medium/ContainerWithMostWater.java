/*
 * https://leetcode.com/problems/container-with-most-water
 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 */
public class ContainerWithMostWater
{
    public int maxArea(int[] height) 
    {
        int left = 0; // Left index will be the first element
        int right = height.length - 1; // Right index will be last element
        int maxArea = 0; // Track maximum area
        while (left < right) // We will start at opposite ends and make the container boundries closer each loop.
        {
            int newArea = (right - left) * Math.min(height[left], height[right]); // Calculate new area.
            maxArea = Math.max(maxArea, newArea);
            if (height[left] > height[right]) // If left element is larger
            {
                right = right - 1; // then lower the right index
            }
            else 
            {
                left = left + 1; // else increase the left index
            }
        }
        return maxArea;
    }
}
