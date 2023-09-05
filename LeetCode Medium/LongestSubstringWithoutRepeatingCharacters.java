/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 */
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters
{
    // This problem is solved using a Sliding Window solution.
    public int lengthOfLongestSubstring(String s) 
    {
        int left = 0;
        int right = 0;
        int res = 0;
        // We will use a map to store the frequency of characters.
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        while (right < s.length())
        {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            // Keep sliding the window to the right if the newest added character has already been seen.
            while (map.get(rightChar) > 1) 
            {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left = left + 1;
            }
            // At this point in the code both left and right pointers are storing 
            // the starting and ending index of a substring that only has unique characters.
            res = Math.max(res, right - left + 1);
            right = right + 1;
        }
        return res;
    }
}
