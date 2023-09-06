/*
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
 * 
 * Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
 */
import java.util.*;
public class N0340_LongestSubstringWithAtMostKDistinctCharacters
{
    // This problem is solved using a Sliding Window solution.
    public int lengthOfLongestSubstringKDistinct(String s, int k) 
    {
        int left = 0;
        int right = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        while (right < s.length())
        {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1); // Increase the frequency by 1 or make it 1 if there is no entry.
            // We use this while loop to shorten the sliding window from the left in case we exceed max distinct characters allowed (k).
            while (map.size() > k)
            {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left = left + 1;
                // Remove the key-value pair entirely if frequency of a character reaches 0.
                if (map.get(leftChar) == 0)
                {
                    map.remove(leftChar);
                }
            }
            res = Math.max(res, right - left + 1);
            right = right + 1;
        }
        return res;
    }
}
 