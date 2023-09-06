/*
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * 
 * Given two strings needle and haystack, 
 * return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 */
public class N0028_FirstOccurrenceInAString
{
    // This problem is solved using a Window Sliding implementation.
    // It may look very similar to a nested for loop approach but this approach optimizes for time and space.
    public int strStr(String haystack, String needle) 
    {
        int haystackPointer = 0;
        int needlePointerLeft = 0;
        int needlePointerRight = 0;
        // We don't need to check the haystack if we get to the point where there a fewer letters remaining than the entire length of needle.
        while (haystackPointer <= haystack.length() - needle.length())
        {
            while (needle.charAt(needlePointerRight - needlePointerLeft) == haystack.charAt(haystackPointer))
            {
                // Return the left index of the window 
                // if the window is just as big as the needle.
                if (needlePointerRight - needlePointerLeft + 1 == needle.length())
                {
                    return needlePointerLeft;
                }
                // Keep increasing the size of the window as the letters are equal.
                else
                {
                    needlePointerRight = needlePointerRight + 1;
                    haystackPointer = haystackPointer + 1;                    
                }
            }
            // If at any point we get into the innermost while loop 
            // and get to this point of the code then that means that 
            // a substring was potentially being considered but was not a complete match. 
            // Therefore, we reset the window and start checking from the next element.
            needlePointerLeft = needlePointerLeft + 1;
            needlePointerRight = needlePointerLeft;
            haystackPointer = needlePointerLeft;
        }
        return -1;
    }
}
