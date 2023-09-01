/*
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
import java.util.*;
public class ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<Integer>(); // A set only has unique elements.
        for (int ele : nums)
        {
            if (!set.add(ele)) // When we call add function on a set, it returns true if the value was added and false if value could not be added.
            {
                return true;
            }
        }
        return false;
    }
}
