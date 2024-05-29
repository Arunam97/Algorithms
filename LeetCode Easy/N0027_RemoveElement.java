/*
* https://leetcode.com/problems/remove-element/
*
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
* The order of the elements may be changed.
* Then return the number of elements in nums which are not equal to val.
* Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
* Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
* The remaining elements of nums are not important as well as the size of nums.
* Return k.
*
* Solution: Two Pointer.
 */

public class N0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        // 'lastIndex' will track the index of the last element in the array which is not equal to 'val'.
        int lastIndex = nums.length - 1;
        // Iterate through the array and swap the elements which are equal to 'val' with the last element of the array.
        for (int i = 0; i <= lastIndex; i++)
        {
            // If the number at index 'i' is equal to 'val', then swap it with the last element of the array.
            if(nums[i] == val)
            {
                nums[i] = nums[lastIndex];
                // Decrement 'i' so that the swapped element can be checked again.
                i--;
                // Decrement 'lastIndex' to indicate that the last element is now swapped.
                lastIndex--;
            }
        }
        return lastIndex + 1;
    }
}
