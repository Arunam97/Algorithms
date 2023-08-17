/*
 * https://leetcode.com/problems/merge-sorted-array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. 
 * nums2 has a length of n.
 */
public class MergeSortedArray
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i = m - 1; // To track the largest element of nums1
        int j = n - 1; // To track the largest element of nums2
        int k = m + n - 1; // To track where the next largest element will be placed
        while(j >= 0) // While there are still elements left in nums2
        {
            if (i >= 0 && nums1[i] > nums2[j]) // If the last element of nums1 is greater than the last element of nums2
            {
                nums1[k] = nums1[i]; // Place it at k index of nums1
                i = i - 1;
            }
            else // If the last element of nums2 is greater than the last element of nums1
            {
                nums1[k] = nums2[j]; // Place the element from nums2 to nums1[k]
                j = j - 1;
            }
            k = k - 1; // Whichever element is bigger the index k is always reduced by 1 as it indicates where the next larger number of the two should be placed
        }
    }
}