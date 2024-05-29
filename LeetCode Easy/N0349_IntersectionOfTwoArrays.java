/*
* https://leetcode.com/problems/intersection-of-two-arrays/
*
* Given two integer arrays nums1 and nums2, return an array of their intersection.
* Each element in the result must be unique, and you may return the result in any order.
*
* Solution: HashSet, but we can also use two pointers; sort the arrays and then compare the elements.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class N0349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Add all elements of nums1 to the set
        for(int num : nums1) {
            set.add(num);
        }

        // Check if the element is present in the set and not in the list
        for(int num : nums2) {
            if(set.contains(num) && !list.contains(num)) {
                list.add(num);
            }
        }

        // Convert the list to array
        int[] arr = new int[list.size()];

        for(int i = 0 ; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
