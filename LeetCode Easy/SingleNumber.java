/*
 * https://leetcode.com/problems/single-number/
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber
{
    public int singleNumber(int[] nums) 
    {
        int result = 0;  // Initialize a variable to store the result
        for (int i = 0 ; i < nums.length ; i++) 
        {
            result = result ^ nums[i];
            /*
             * The logic for XOR(^) is that XOR with the same number effectively cancels it out (2 ^ 2 = 0) and XOR operations chain
             * Therefore we can chain all the elements in an XOR chain and the only number left at the end is the unique number
             */
        }
        return result;  // The final value of "result" is the unique number
    }
}
