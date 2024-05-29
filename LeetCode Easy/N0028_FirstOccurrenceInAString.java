/*
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * 
 * Given two strings needle and haystack, 
 * return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 *
 * Solution: Tow Pointer.
 */

public class N0028_FirstOccurrenceInAString
{
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0.
        if(needle.length() == 0) {
            return 0;
        }
        // If haystack is empty, return -1.
        if(haystack.length() == 0) {
            return -1;
        }
        // Loop through the haystack.
        for (int i = 0 ; i < haystack.length() - needle.length() + 1; i++) {
            int needlePointer = 0;
            int storeI = i;
            // Use a while loop to check if the needle is present in the haystack.
            while(haystack.charAt(i) == (needle.charAt(needlePointer))) {
                i++;
                needlePointer++;
                // If needlePointer reaches the length of the needle, then return the index where the needle was found.
                if(needlePointer == needle.length()) {
                    return storeI;
                }
            }
            // If needle was not found, reset the i to the stored index and needlePointer to 0.
            i = storeI;
            needlePointer = 0;
        }
        // If needle was not found, return -1.
        return -1;
    }
}
