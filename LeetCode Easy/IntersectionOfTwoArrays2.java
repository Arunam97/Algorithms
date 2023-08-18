import java.util.*;
/*
 * https://leetcode.com/problems/intersection-of-two-arrays-ii
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionOfTwoArrays2
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele : nums1) // Map frequency of all elements in nums1
        {
            if(map.containsKey(ele)) // If element has already been seen, increase its count by 1
            {
                int count = map.get(ele);
                count = count + 1;
                map.put(ele, count);
            }
            else // If element is not in map, then add it to the map with count 1
            {
                map.put(ele, 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>(); // List where we store our common elements
        for (int ele : nums2)
        {
            if (map.containsKey(ele) && map.get(ele) > 0) // If the map has that element and its count is greater than 1
            {
                list.add(ele); // then add it to the list
                int count = map.get(ele); // get the count
                count = count - 1; // decrease the count by 1
                map.put(ele, count); // and assign it to the element.
            }
        }
        int[] output = new int[list.size()]; // Output array
        for(int i = 0 ; i < list.size(); i++) // Simple ArrayList to Array.
        {
            output[i] = list.get(i);
        }
        return output;
    }
}
