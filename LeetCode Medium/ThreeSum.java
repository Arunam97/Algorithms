/*
 * https://leetcode.com/problems/3sum/
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */
import java.util.*;
public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        // The final list is being initialized as a set to avoid duplicates.
        Set<List<Integer>> outputSet = new HashSet<List<Integer>>();
        List<List<Integer>> outputList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for (int left = 0 ; left < nums.length - 2 ; left++)
        {
            int mid = left + 1;
            int right = nums.length - 1;
            while (mid < right)
            {
                int sum = nums[left] + nums[mid] + nums[right];
                // If sum is 0 then add the 3 numbers in an ArrayList and add that list to the set.
                if (sum == 0)
                {
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[left]);
                    triplet.add(nums[mid]);
                    triplet.add(nums[right]);
                    outputSet.add(triplet);
                    mid = mid + 1;
                    right = right - 1;
                }
                // If sum is less than 0 then increase mid by 1.
                else if (sum < 0)
                {
                    mid = mid + 1;
                }
                // If sum is more than 0 then decrease right by 1.
                else
                {
                    right = right - 1;
                }
            }
        }
        outputList.addAll(outputSet);
        return outputList;    
    }
}
