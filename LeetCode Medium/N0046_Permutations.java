/*
 * https://leetcode.com/problems/permutations/
 * 
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */
import java.util.*;
public class N0046_Permutations
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        backtrack(output, new ArrayList<Integer>(), nums);
        return output;
    }

    // We will use backtracking to populate the individual permutations.
    private void backtrack(List<List<Integer>> output, List<Integer> current, int[] nums)
    {
        // If size of 'current' list reaches size of 'nums' that means all elements have been placed. We can add this list to our 'output' list.
        if (current.size() == nums.length)
        {
            output.add(new ArrayList<Integer>(current));
            return;
        }
        // Logic for backtracking: Add an element, call backtrack on the new list, then remove that element and add another one. Repeat till you hit base case.
        for (int ele : nums) 
        {
            if (!current.contains(ele))
            {
                current.add(ele);
                backtrack(output, current, nums);
                current.remove(current.size() - 1);
            }
        }
    }
}
