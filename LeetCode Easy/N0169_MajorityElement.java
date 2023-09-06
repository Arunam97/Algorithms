/*
 * https://leetcode.com/problems/majority-element/
 * 
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 */
import java.util.*;
public class N0169_MajorityElement
{
    public int majorityElement(int[] nums) 
    {
        int output = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // Map to store the number of times each element ocurrs.
        for (int ele : nums)
        {
            if (map.containsKey(ele)) // If element has already been seen, increase its count by 1.
            {
                int count = map.get(ele);
                count = count + 1;
                map.put(ele, count);
            }
            else // If element is not in map, then add it to the map with count 1.
            {
                map.put(ele, 1);
            }
            if (map.get(ele) > Math.floor(nums.length/2)) // Return this element if its count is > ⌊n / 2⌋.
            {
                output = ele;
                break;
            }
        }
        return output; // If no element has the majority.
    }
}
