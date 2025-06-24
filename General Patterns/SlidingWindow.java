// Initialize left and right pointer for sliding window.
// Initialize map to maintain the window.
// While condition to increase size of window.
// Perform operation and add element at right to window.
// While condition to check validity of window and to decrease its size.
// Close both while loops and use left and right pointer to perform operation on the window/array.

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public int lengthOfLongestSubstring(String s)
    {
        int left = 0;
        int right = 0;
        int res = 0;
        // We will use a map to store the frequency of characters.
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        // Condition to increase size of window
        while (right < s.length())
        {
            // Perform operation and add to the window latest element.
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            // Move left pointer while window condition is not satisfied.
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
