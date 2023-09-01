/*
 * https://leetcode.com/problems/sort-colors/
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 */
public class SortColors
{
    public void sortColors(int[] nums) 
    {
        int red = 0; // Variable red will track the index where the next 0 needs to be placed.
        int blue = nums.length - 1; // Variable blue will track where the next 2 needs to be placed.
        int i = 0;
        while (i <= blue)
        {
            if (nums[i] == 0) // If the number at i index is 0,
            {
                swap(nums, i, red); // Then swap it with index red,
                red = red + 1; // And increase red by 1, to denote where the next 0 will be placed.
                i = i + 1;
            }
            else if (nums[i] == 2) // If number at i index is 2,
            {
                swap(nums, i, blue); // Then swap it with index blue,
                blue = blue - 1; // And decrease blue by 1, to deonte where the next 2 will be placed.
                /*
                 * We don't increment i when nums[i] is 2 because we also have to check the number that was swapped with 2 
                 * as that number has been brought from ahead of the array and not been checked yet.
                 */     
            }
            else
            {
                i = i + 1;
            }
        }
    }
    
    // Simple helper method to swap 2 elements of an array.
    private void swap(int[] arr, int index1, int index2) 
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
