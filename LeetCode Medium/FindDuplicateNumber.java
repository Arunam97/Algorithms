/*
 * https://leetcode.com/problems/find-the-duplicate-number/
 * 
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 */
public class FindDuplicateNumber
{
    // We will use Floyd's Cycle Detection to solve this problem.
    public int findDuplicate(int[] nums) 
    {
        int slow = 0;
        int fast = 0;
        // Phase 1: Get both the slow and the fast pointer in the cycle and find the intersection point.
        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        /*
         * Phase 2: Set the slow pointer to the beginning
         * and start the fast pointer from the intersection point
         * but lower its speed to be the same as the slow pointer.
         */
        slow = 0;
        while (slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
